package businesslayer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AvailableMenu {

	private static AvailableMenu instance = new AvailableMenu();
	private HashMap<Integer,GardenObject> availableList = new HashMap<Integer,GardenObject>();
	private HashMap<String,Integer> availableHash = new HashMap<String,Integer>();
	
	public static AvailableMenu getInstance(){
		return instance;
	}
	
	public AvailableMenu(){};
	
	public HashMap<Integer, GardenObject> getAvailableList() {
		return availableList;
	}

	public void setAvailableList(HashMap<Integer, GardenObject> availableList) {
		this.availableList = availableList;
	}

	public HashMap<String, Integer> getAvailableHash() {
		return availableHash;
	}

	public void setAvailableHash(HashMap<String, Integer> availableHash) {
		this.availableHash = availableHash;
	}
	
	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addItem(GardenObject gardenObj){
		observers.add(gardenObj);
		availableHash.put(gardenObj.getName(),availableList.size()+1);
		availableList.put(availableList.size()+1, gardenObj);
	}
	
	public void notifyAllObservers(GardenObject gardenObject){
	      for (Observer observer : observers) {
	         observer.update(gardenObject);
	         observer.updateGood(gardenObject);
	      }
	} 
	
	public void resetColors(){
		Iterator iter = this.getAvailableList().entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry pair = (Map.Entry)iter.next();
			((GardenObject) pair.getValue()).setColor(Color.yellow);
		}
	}
	
}
