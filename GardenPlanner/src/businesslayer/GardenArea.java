package businesslayer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class GardenArea {

	private AvailableMenu menu = AvailableMenu.getInstance();
	private List<Observer> observers = new ArrayList<Observer>();
	private List<GardenObject> gardenObjects = new ArrayList<GardenObject>();
	private List<GardenArea> gardens = new ArrayList<GardenArea>();
	private double height;
	private double width;
	private String name;
	
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
	
	public GardenArea() {

	}

	public void addGardenObject(GardenObject gardenObject){
		notifyAllObservers(gardenObject);
		for(GardenObject gardenObj:this.getGardenObjects()){
			if(gardenObj.getBadPlants()!=null && gardenObj.getBadPlants().contains(gardenObject.getName())){
				gardenObject.setColor(Color.red);
			}
		}
		gardenObjects.add(gardenObject);
		observers.add(gardenObject);
		menu.notifyAllObservers(gardenObject);
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

	public void draw(){
		System.out.print("Garden " +this.name+ " contains:\n");
		for(GardenObject gardenObj:this.gardenObjects){
			gardenObj.draw();
		}
	}
	
	public void notifyAllObservers(GardenObject gardenObject){
	      for (Observer observer : observers) {
	         observer.update(gardenObject);
	      }
	} 
	
	public void adjustColors(){
		List<GardenObject> tempList = new ArrayList<GardenObject>();
		for(GardenObject gardenObj:this.gardenObjects){
			tempList.add(gardenObj)	;
		}
		gardenObjects.clear();
		observers.clear();
		for(GardenObject gardenObj:tempList){
			gardenObj.setColor(Color.yellow);
			this.addGardenObject(gardenObj);
		}
	}
	
	public void clear(){
		this.getGardenObjects().clear();
		this.getGardens().clear();
		this.setHeight(0);
		this.setWidth(0);
		this.setName(null);
	}
}
