package datalayer;

import java.util.ArrayList;

public class GardenDBObject {
	
	private ArrayList<PlantDBObject> gardenPlants = new ArrayList<PlantDBObject>();
	private String name;
	
	GardenDBObject(String name, ArrayList<String> plants){
		this.setName(name);
		createPlants(plants);
	}
	
	private void createPlants(ArrayList<String> plants){
		for(String plant:plants){
			gardenPlants.add(new PlantDBObject(plant));
		}
	}
	public ArrayList<PlantDBObject> getPlants() {
		return gardenPlants;
	}

	public void setPlants(ArrayList<PlantDBObject> plants) {
		this.gardenPlants = plants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
