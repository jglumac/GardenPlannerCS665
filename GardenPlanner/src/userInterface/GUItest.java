package userInterface;

import java.util.ArrayList;
import java.util.List;

import drawableItems.AbstractFactory;
import drawableItems.FactoryGenerator;
import drawableItems.GardenObject;
import drawableItems.GardenObjectCache;
import drawableItems.Plant;
import drawableItems.Structure;

public class GUItest {

	public static List<String> plantList = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Testing Abstract Factory...\n\n");
		
		AbstractFactory plantFactory = FactoryGenerator.getFactory("Plant");
		Plant newHerb = plantFactory.getPlant("Herb");
		newHerb.setName("Rosemary");
		newHerb.draw();
		newHerb.onSelect();
		
		Plant newVegetable = plantFactory.getPlant("Vegetable");
		newVegetable.setName("Carrot");
		newVegetable.draw();
		newVegetable.onSelect();
		
		Plant newFruit = plantFactory.getPlant("Fruit");
		newFruit.setName("Strawberry");
		newFruit.draw();
		newFruit.onSelect();
		
		Plant newFlower = plantFactory.getPlant("Flower");
		newFlower.setName("Tulip");
		newFlower.draw();
		newFlower.onSelect();
		
		Plant newShrub = plantFactory.getPlant("Shrub");
		newShrub.setName("Hydrangea");
		newShrub.draw();
		newShrub.onSelect();
		
		Plant newTree = plantFactory.getPlant("Tree");
		newTree.setName("Maple");
		newTree.draw();
		newTree.onSelect();

		AbstractFactory structureFactory = FactoryGenerator.getFactory("Structure");		
		Structure newTrellis = structureFactory.getStructure("Trellis");
		newTrellis.setName("Cucumber Trellis");
		newTrellis.draw();
		
		Structure newStake = structureFactory.getStructure("Stake");
		newStake.setName("Tomato Stake");
		newStake.draw();
		
		System.out.print("\n\nTesting Abstract Factory with Prototype...\n\n");
		GardenObjectCache.loadCache();
		
		GardenObject rosemaryClone = GardenObjectCache.getGardenObject("Herb");
		rosemaryClone.draw();
		rosemaryClone.setName("Rosemary");
		rosemaryClone.draw();
		
		GardenObject thymeClone = GardenObjectCache.getGardenObject("Herb");
		thymeClone.draw();
		thymeClone.setName("Thyme");
		thymeClone.draw();		
		
		GardenObject cukeTrellisClone = GardenObjectCache.getGardenObject("Trellis");
		cukeTrellisClone.draw();
		cukeTrellisClone.setName("Cucumber Trellis");
		cukeTrellisClone.draw();
		
		
		
	}

	public static List<String> getPlantList() {
		return plantList;
	}

	public void setPlantList(List<String> plantList) {
		GUItest.plantList = plantList;
	}

}
