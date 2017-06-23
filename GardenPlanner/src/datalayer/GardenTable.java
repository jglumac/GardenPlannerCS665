package datalayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import utilities.Constants;

public class GardenTable {

	private HashMap<Integer,Set> lookUp = new HashMap<Integer, Set>();
	private HashMap<String,ArrayList> gardens = new HashMap<String, ArrayList>();
	
	private static GardenTable instance = new GardenTable();
	
	public static GardenTable getInstance(){
		return instance;
	}
	
	private GardenTable(){
		populateTables();
	}
	
	private void populateTables(){
		lookUp.put(1, new HashSet<String>(Arrays.asList("GardenOne","VeggieGarden","HerbGarden")));
		lookUp.put(2, new HashSet<String>(Arrays.asList("GardenFour")));
		
		gardens.put("GardenOne", new ArrayList<String>(Arrays.asList(Constants.Carrot,Constants.Dill)));
		gardens.put("VeggieGarden", new ArrayList<String>(Arrays.asList(Constants.Carrot,Constants.Tomato)));
		gardens.put("HerbGarden", new ArrayList<String>(Arrays.asList(Constants.Fennel,Constants.Dill)));
		gardens.put("GardenFour", new ArrayList<String>(Arrays.asList(Constants.Carrot,Constants.Borage,Constants.Cucumber)));
		

	}
	
	
	public ArrayList<GardenDBObject> getGardens(Integer userID){
		ArrayList<GardenDBObject> gardenList = new ArrayList<GardenDBObject>();
		HashSet gardens = (HashSet) lookUp.get(userID);
		gardens.forEach(garden->gardenList.add(new GardenDBObject((String) garden, this.gardens.get(garden))));
		return gardenList;
		
	}
	
	private ArrayList getGardenList(Integer gardenID){
		return gardens.get(gardenID);		
	}

	public void addGarden(Integer userID, String gardenName, ArrayList<String> plants) {
		this.lookUp.get(userID).add(gardenName);
		gardens.put(gardenName, plants);		
	}
	
	
}
