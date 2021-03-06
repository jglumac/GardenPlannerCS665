package datalayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataLayerFacade {

	private static DataLayerFacade instance = new DataLayerFacade();
	private UserTable newUserTable = UserTable.getInstance();
	private GardenTable newGardenTable = GardenTable.getInstance();
	
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
	
	public ArrayList<GardenDBObject> getGardensByUserID(String userName){

		if(newUserTable.getUserID(userName)!=null){
			//get gardens for existing user
			return newGardenTable.getGardens(newUserTable.getUserID(userName));
			
		}
		else{
			//create new user
			newUserTable.addUser(userName);
			return new ArrayList<GardenDBObject>();
		}
		
		
	}
	
	public void saveGarden(String userName, String gardenName, ArrayList<String> plants){
		newGardenTable.addGarden(newUserTable.getUserID(userName), gardenName, plants);
	}
	
}
