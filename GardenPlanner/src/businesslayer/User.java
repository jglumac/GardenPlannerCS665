package businesslayer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class User {

	private static User instance = new User();
	private String name;
	private HashMap<Integer,UserGarden> gardenList= new HashMap<Integer,UserGarden>();
	
	public static User getInstance(){
		return instance;
	}
	
	private User(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<Integer,UserGarden> getGardenList() {
		return gardenList;
	}

	public void setGardenList(HashMap<Integer,UserGarden> gardenList) {
		this.gardenList = gardenList;
	}
	
	public void addGarden(UserGarden garden){
		gardenList.put(this.gardenList.size()+1, garden);
	}
	
	public void drawGardens(){
		int count = 1;
		System.out.println("User " + this.getName() + "'s gardens:");
		Iterator iter = this.getGardenList().entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry pair = (Map.Entry)iter.next();
			UserGarden userGarden = (UserGarden) pair.getValue();
			System.out.println(count + ") " + userGarden.getGardenName());
			System.out.println("Contains: ");
			for(GardenObject object:userGarden.getGardenList()){
				System.out.println(object.getName() + ",");
			}
			count++;
		}
	}
	
	
}
