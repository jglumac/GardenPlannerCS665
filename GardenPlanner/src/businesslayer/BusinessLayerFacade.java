package businesslayer;

import java.awt.Color;
import java.util.ArrayList;
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
	private GardenArea garden = new GardenArea();
	private User currentUser = User.getInstance();


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
	
	public int getGardensByUserID(String userName){
		currentUser.setName(userName);
		ArrayList<GardenDBObject> dbGardens = data.getGardensByUserID(userName);
		for(GardenDBObject dbGarden:dbGardens){
			currentUser.addGarden(translateGardenToUserGarden(dbGarden));
		}
		return dbGardens.size();
	}
	
	public void drawUserGardens(){
		currentUser.drawGardens();
	}
	
	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	public UserGarden translateGardenToUserGarden(GardenDBObject dbGarden){
		
		UserGarden newGarden = new UserGarden(dbGarden.getName());
		for(PlantDBObject dbplant:dbGarden.getPlants()){
			newGarden.addObject((GardenObject) getAvailableMenu().getAvailableList().get(getAvailableMenu().getAvailableHash().get(dbplant.getName())).clone());
		}
		return newGarden;
	}
	
	public void setGardenName(String name){
		garden.setName(name);
	}
	
}
