package drawableItems;

import java.util.Hashtable;

public class GardenObjectCache {

	
	   private static Hashtable<String, GardenObject> objectMap  = new Hashtable<String, GardenObject>();

	   public static GardenObject getGardenObject(String name) {
	      GardenObject cachedObject = objectMap.get(name);
	      return (GardenObject) cachedObject.clone();
	   }

	   // for each shape run database query and create shape
	   // shapeMap.put(shapeKey, shape);
	   // for example, we are adding three shapes
	   
	   public static void loadObjectCache() {  
			AbstractFactory plantFactory = FactoryGenerator.getFactory("Plant");
			
			GardenObject herb = plantFactory.getPlant("Herb");
			herb.setName("Herb");
			objectMap.put(herb.getName(),herb);
			
			GardenObject flower = plantFactory.getPlant("Flower");
			flower.setName("Flower");
			objectMap.put(flower.getName(),flower);
			 
			GardenObject fruit = plantFactory.getPlant("Fruit");
			fruit.setName("Fruit");
			objectMap.put(fruit.getName(),fruit);
			  
			GardenObject vegetable = plantFactory.getPlant("Vegetable");
			vegetable.setName("Vegetable");
			objectMap.put(vegetable.getName(),vegetable);
			  
			GardenObject tree = plantFactory.getPlant("Tree");
			tree.setName("Tree");
			objectMap.put(tree.getName(),tree);
			  
			GardenObject shrub = plantFactory.getPlant("Shrub");
			shrub.setName("Shrub");
			objectMap.put(shrub.getName(),shrub);
	   }
	   
	   public static void loadCache() {  
			AbstractFactory plantFactory = FactoryGenerator.getFactory("Plant");
			AbstractFactory structureFactory = FactoryGenerator.getFactory("Structure");
			
			Plant herb = plantFactory.getPlant("Herb");
			herb.setName("Herb");
			objectMap.put(herb.getName(),herb);
			
			Plant flower = plantFactory.getPlant("Flower");
			flower.setName("Flower");
			objectMap.put(flower.getName(),flower);
			 
			Plant fruit = plantFactory.getPlant("Fruit");
			fruit.setName("Fruit");
			objectMap.put(fruit.getName(),fruit);
			  
			Plant vegetable = plantFactory.getPlant("Vegetable");
			vegetable.setName("Vegetable");
			objectMap.put(vegetable.getName(),vegetable);
			  
			Plant tree = plantFactory.getPlant("Tree");
			tree.setName("Tree");
			objectMap.put(tree.getName(),tree);
			  
			Plant shrub = plantFactory.getPlant("Shrub");
			shrub.setName("Shrub");
			objectMap.put(shrub.getName(),shrub);
			
			Structure trellis = structureFactory.getStructure("Trellis");
			trellis.setName("Trellis");
			objectMap.put(trellis.getName(),trellis);
			
			Structure stake = structureFactory.getStructure("Stake");
			stake.setName("Stake");
			objectMap.put(stake.getName(),stake);
	   }
	   
}
