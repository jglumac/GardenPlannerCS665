package datalayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataLayerFacade {

	private static DataLayerFacade instance = new DataLayerFacade();
	
	public static DataLayerFacade getInstance(){
		return instance;
	}
	
	private DataLayerFacade(){
		
	}
	
	
	//Get list of objects from database to populate the Available List
	public HashMap<String, PlantDBObject> getPlantList(String query){
		PlantTable newPlantTable  = PlantTable.getInstance();
		return newPlantTable.getAllPlants();
	}
	
	public ArrayList<HashSet> getUserGardens(String userName){
		
		
		return null;
		
	}
	
}
