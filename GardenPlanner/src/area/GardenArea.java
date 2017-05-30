package area;

import java.util.ArrayList;
import java.util.List;

import drawableItems.GardenObject;

public class GardenArea {

	List<GardenObject> gardenObjects = new ArrayList<GardenObject>();
	List<GardenArea> gardens = new ArrayList<GardenArea>();
	double height;
	double width;
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GardenArea(double height, double width, String name){
		this.height = height;
		this.width = width;
		this.name = name;
	}
	
	public void addGardenObject(GardenObject gardenObject){
		gardenObjects.add(gardenObject);		
	}
	
	public void removeGardenObject(GardenObject gardenObject){
		gardenObjects.remove(gardenObject);
	}

	public List<GardenObject> getGardenObjects() {
		return gardenObjects;
	}

	public void setGardenObjects(List<GardenObject> gardenObjects) {
		this.gardenObjects = gardenObjects;
	}

	public void addGarden(GardenArea garden){
		gardens.add(garden);		
	}
	
	public void removeGarden(GardenArea garden){
		gardens.remove(garden);
	}
	
	public List<GardenArea> getGardens() {
		return gardens;
	}

	public void setGardens(List<GardenArea> gardens) {
		this.gardens = gardens;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void printGardens(){
		System.out.print("Garden name: " +this.name+ "\n");
		for(GardenArea area:this.gardens){
			area.printGardens();
		}
	}

}
