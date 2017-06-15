package datalayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import utilities.Constants;

public class GardenTable {

	private HashMap<Integer,Set> lookUp = new HashMap<Integer, Set>();
	private HashMap<Integer,ArrayList> gardens = new HashMap<Integer, ArrayList>();
	
	private static GardenTable instance = new GardenTable();
	
	public static GardenTable getInstance(){
		return instance;
	}
	
	private GardenTable(){
		populateTables();
	}
	
	private void populateTables(){
		lookUp.put(1, new HashSet<Integer>(Arrays.asList(1,2,3)));
		lookUp.put(2, new HashSet<Integer>(Arrays.asList(4)));
		
		gardens.put(1, new ArrayList<String>(Arrays.asList(Constants.Carrot,Constants.Dill)));
		gardens.put(2, new ArrayList<String>(Arrays.asList(Constants.Carrot,Constants.Tomato)));
		gardens.put(3, new ArrayList<String>(Arrays.asList(Constants.Fennel,Constants.Dill)));
		gardens.put(4, new ArrayList<String>(Arrays.asList(Constants.Carrot,Constants.Borage,Constants.Cucumber)));
		

	}
	
	
	private HashSet getGardens(Integer userID){
		return (HashSet) lookUp.get(userID);
	}
	
	private ArrayList getGardenList(Integer gardenID){
		return gardens.get(gardenID);		
	}
	
	
}
