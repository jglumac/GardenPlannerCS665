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
	
	private HashMap<String, PlantDBObject> dbPlantList = new HashMap<String, PlantDBObject>();
	
	private static BusinessLayerFacade instance = new BusinessLayerFacade();
	
	public static BusinessLayerFacade getInstance(){
		return instance;
	}
	
	private BusinessLayerFacade(){
		GardenObjectCache.loadCache();
	}
	
	public AvailableMenu getAvailableMenu(String query){
		
		setPlantsFromDB(query);
		AvailableMenu available = AvailableMenu.getInstance();
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
		
		return available;
		
	}
	
	private void setPlantsFromDB(String query){
		this.dbPlantList = data.getPlantList(query);
	}
	
	
}
