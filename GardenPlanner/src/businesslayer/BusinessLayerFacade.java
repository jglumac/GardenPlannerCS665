package businesslayer;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import datalayer.DataLayerFacade;
import datalayer.GardenDBObject;
import datalayer.PlantDBObject;

public class BusinessLayerFacade {

	private DataLayerFacade data= DataLayerFacade.getInstance();
	private String criteriaQuery = null;
	
	private AvailableMenu available = AvailableMenu.getInstance();
	private GardenArea garden = new GardenArea(10, 10, "Jon's Garden");
	private CommandManager commManager = new CommandManager();
	private HashMap<String, PlantDBObject> dbPlantList = new HashMap<String, PlantDBObject>();
	
	private static BusinessLayerFacade instance = new BusinessLayerFacade();
	
	public static BusinessLayerFacade getInstance(){
		return instance;
	}
	
	private BusinessLayerFacade(){
		GardenObjectCache.loadCache();
		setAvailableMenu();
	}
	
	private void setAvailableMenu(){
		
		setPlantsFromDB(this.criteriaQuery);

		Iterator iter = dbPlantList.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry pair = (Map.Entry)iter.next();
			PlantDBObject temp = (PlantDBObject) pair.getValue();
			GardenObject clone = new GardenObject();
			clone = GardenObjectCache.getGardenObject(temp.getType());
			clone.setName(temp.getName());
			clone.setBadPlants(temp.getBadPlants());
			clone.setColor(Color.yellow);
			clone.setCompanionPlants(temp.getCompanionPlants());
			clone.setDiameter(temp.getDiameter());
			available.addItem(clone);
		}
		
	}
	
	private AvailableMenu getAvailableMenu(){
		return this.available;
	}
	
	private void setPlantsFromDB(String query){
		this.dbPlantList = data.getPlantList(query);
	}
	
	public void drawAvailableMenu(){
		Iterator iter = getAvailableMenu().getAvailableList().entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry pair = (Map.Entry)iter.next();
			System.out.print("" + pair.getKey() + ") ");
			((GardenObject) pair.getValue()).draw();
		}
	}
	
	public void displaySelection(String selection){
		System.out.print("User selected: " + getAvailableMenu().getAvailableList().get(Integer.parseInt(selection)).getName() + "\n");
	}
	
	public void addToGarden(String selection){
		GardenObject newGO = (GardenObject) getAvailableMenu().getAvailableList().get(Integer.parseInt(selection)).clone();
		newGO.setColor(Color.YELLOW);
		commManager.ExecuteCommand(new AddObjectCommand(garden, newGO));
	}
	
	public void drawGarden(){
		garden.draw();
	}
	
	public void undoCommand(){
		commManager.Undo();
	}
	
}
