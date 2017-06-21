package businesslayer;

import java.util.ArrayList;

public class UserGarden {
	
	private String gardenName;
	private ArrayList<GardenObject> gardenList = new ArrayList<GardenObject>();
	
	UserGarden(String gardenName){
		this.setGardenName(gardenName);
	}

	public ArrayList<GardenObject> getGardenList() {
		return gardenList;
	}

	public void setGardenList(ArrayList<GardenObject> gardenList) {
		this.gardenList = gardenList;
	}

	public String getGardenName() {
		return gardenName;
	}

	public void setGardenName(String gardenName) {
		this.gardenName = gardenName;
	}
	
	public void addObject(GardenObject newObj){
		gardenList.add(newObj);
	}
	

}
