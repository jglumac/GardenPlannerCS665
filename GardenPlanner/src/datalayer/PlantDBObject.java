package datalayer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import utilities.Constants;

public class PlantDBObject {
	
	private String name;
	private double diameter;
	private String type;
	private HashSet<String> badPlants = new HashSet<String>();
	private HashSet<String> companionPlants = new HashSet<String>();
	
	PlantDBObject(String plantName){
		
		this.name = plantName;
		setPlant();
	}
	
	private void setPlant(){
		
		switch(this.name){
			case Constants.Rosemary:
				this.diameter=6.0;
				this.type = Constants.Herb;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Thyme:
				this.diameter=6.0;
				this.type = Constants.Herb;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Dill:
				this.diameter=6.0;
				this.type = Constants.Herb;
				this.badPlants = new HashSet<String>(Arrays.asList(Constants.Fennel,Constants.Carrot));
				this.companionPlants = new HashSet<String>(Arrays.asList());	
				break;
			case Constants.Fennel:
				this.diameter=6.0;
				this.type = Constants.Herb;
				this.badPlants = new HashSet<String>(Arrays.asList(Constants.Dill));
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Carrot:
				this.diameter=6.0;
				this.type = Constants.Vegetable;
				this.badPlants = new HashSet<String>(Arrays.asList(Constants.Fennel, Constants.Dill));
				this.companionPlants = new HashSet<String>(Arrays.asList(Constants.Tomato));
				break;
			case Constants.Tomato:
				this.diameter=6.0;
				this.type = Constants.Vegetable;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList(Constants.Carrot));
				break;
			case Constants.Cucumber:
				this.diameter=6.0;
				this.type = Constants.Vegetable;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Borage:
				this.diameter=6.0;
				this.type = Constants.Herb;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Strawberry:
				this.diameter=6.0;
				this.type = Constants.Fruit;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Raspberry:
				this.diameter=6.0;
				this.type = Constants.Fruit;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Yarrow:
				this.diameter=6.0;
				this.type = Constants.Flower;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Nasturtium:
				this.diameter=6.0;
				this.type = Constants.Flower;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Calendula:
				this.diameter=6.0;
				this.type = Constants.Flower;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Angelica:
				this.diameter=6.0;
				this.type = Constants.Herb;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Basil:
				this.diameter=6.0;
				this.type = Constants.Herb;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Blueberry:
				this.diameter=6.0;
				this.type = Constants.Fruit;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.ButterflyWeed:
				this.diameter=6.0;
				this.type = Constants.Flower;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Cabbage:
				this.diameter=6.0;
				this.type = Constants.Vegetable;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Marigold:
				this.diameter=6.0;
				this.type = Constants.Flower;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Pea:
				this.diameter=6.0;
				this.type = Constants.Vegetable;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Potato:
				this.diameter=6.0;
				this.type = Constants.Vegetable;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			case Constants.Sunflower:
				this.diameter=6.0;
				this.type = Constants.Flower;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;
			default:
				this.diameter=6.0;
				this.type = Constants.Flower;
				this.badPlants = new HashSet<String>(Arrays.asList());
				this.companionPlants = new HashSet<String>(Arrays.asList());
				break;

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HashSet<String> getBadPlants() {
		return badPlants;
	}

	public void setBadPlants(HashSet<String> badPlants) {
		this.badPlants = badPlants;
	}

	public HashSet<String> getCompanionPlants() {
		return companionPlants;
	}

	public void setCompanionPlants(HashSet<String> companionPlants) {
		this.companionPlants = companionPlants;
	}

}
