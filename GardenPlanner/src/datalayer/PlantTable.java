package datalayer;

import java.util.HashMap;

import utilities.Constants;

public class PlantTable {

	HashMap<String, PlantDBObject> lookUp = new HashMap<String, PlantDBObject>();
	
	private static PlantTable instance = new PlantTable();
	
	public static PlantTable getInstance(){
		return instance;
	}
	
	private PlantTable(){
		populatePlantTable();
	}

	private void populatePlantTable(){
		lookUp.put(Constants.Angelica, new PlantDBObject(Constants.Angelica));
		lookUp.put(Constants.Basil, new PlantDBObject(Constants.Basil));
		lookUp.put(Constants.Blueberry, new PlantDBObject(Constants.Blueberry));
		lookUp.put(Constants.Borage, new PlantDBObject(Constants.Borage));
		lookUp.put(Constants.ButterflyWeed, new PlantDBObject(Constants.ButterflyWeed));
		lookUp.put(Constants.Calendula, new PlantDBObject(Constants.Calendula));
		lookUp.put(Constants.Carrot, new PlantDBObject(Constants.Carrot));
		lookUp.put(Constants.Cabbage, new PlantDBObject(Constants.Cabbage));
		lookUp.put(Constants.Cucumber, new PlantDBObject(Constants.Cucumber));
		lookUp.put(Constants.Dill, new PlantDBObject(Constants.Dill));
		lookUp.put(Constants.Fennel, new PlantDBObject(Constants.Fennel));
		lookUp.put(Constants.Lettuce, new PlantDBObject(Constants.Lettuce));
		lookUp.put(Constants.Marigold, new PlantDBObject(Constants.Marigold));
		lookUp.put(Constants.Nasturtium, new PlantDBObject(Constants.Nasturtium));
		lookUp.put(Constants.Parsley, new PlantDBObject(Constants.Parsley));
		lookUp.put(Constants.Pea, new PlantDBObject(Constants.Pea));
		lookUp.put(Constants.Potato, new PlantDBObject(Constants.Potato));
		lookUp.put(Constants.Raspberry, new PlantDBObject(Constants.Raspberry));
		lookUp.put(Constants.Rosemary, new PlantDBObject(Constants.Rosemary));
		lookUp.put(Constants.Strawberry, new PlantDBObject(Constants.Strawberry));
		lookUp.put(Constants.Sunflower, new PlantDBObject(Constants.Sunflower));
		lookUp.put(Constants.Thyme, new PlantDBObject(Constants.Thyme));
		lookUp.put(Constants.Tomato, new PlantDBObject(Constants.Tomato));
		lookUp.put(Constants.Yarrow, new PlantDBObject(Constants.Yarrow));
	}
	
	public HashMap<String, PlantDBObject> getAllPlants(){
		return this.lookUp;
	}
}
