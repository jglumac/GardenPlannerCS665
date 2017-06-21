package datalayer;

import java.util.HashMap;

import businesslayer.PlantFactory;

public class UserTable {

	private HashMap<String,Integer> lookUp = new HashMap<String,Integer>();
	
	private static UserTable instance = new UserTable();
	
	public static UserTable getInstance(){
		return instance;
	}
	
	private UserTable(){
		populateTable();
	}
	
	private void populateTable(){
		lookUp.put("Jon", 1);
		lookUp.put("Tanya",2);
		lookUp.put("Nina", 3);
		lookUp.put("Stella", 4);
	}
	
	public void addUser(String userName){
		lookUp.put(userName, lookUp.size()+1);
		System.out.println("User: " + userName + " added to system!");
	}
	
	public Integer getUserID(String userName){
		return lookUp.get(userName);
	}
}
