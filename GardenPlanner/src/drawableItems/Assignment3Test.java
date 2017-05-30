package drawableItems;

import java.util.ArrayList;
import java.util.List;

import area.GardenArea;
import drawableItems.AbstractFactory;
import drawableItems.FactoryGenerator;
import drawableItems.GardenObject;
import drawableItems.GardenObjectCache;
import drawableItems.Plant;
import drawableItems.Structure;
import drawableItems.RedPlantDecorator;
import drawableItems.GreenPlantDecorator;
import drawableItems.YellowPlantDecorator;

public class Assignment3Test {

	public static List<String> plantList = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Testing Abstract Factory and Mediator...\n\n");
		
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
		
		
		
		
		System.out.print("\n\nTesting Decorator Design Pattern...\n\n");	
		
		newFruit.draw();
		System.out.print("Applying red decorator...\n");
		IPlant redNewFruit = new RedPlantDecorator(newFruit);
		System.out.print("Applying yellow decorator...\n");
		IPlant yellowNewFruit = new YellowPlantDecorator(newFruit);
		System.out.print("Applying green decorator...\n");
		IPlant greenNewFruit = new GreenPlantDecorator(newFruit);
		
		
		
		
		System.out.print("\n\nTesting Composite Design Pattern...\n\n");		
		
		GardenArea thirdTierA = new GardenArea(10, 10, "Tier3a");
		GardenArea thirdTierB = new GardenArea(10, 10, "Tier3b");
		GardenArea thirdTierC = new GardenArea(10, 10, "Tier3c");
		GardenArea thirdTierD = new GardenArea(10, 10, "Tier3d");
		GardenArea secondTierA = new GardenArea(10, 10, "Tier2a");
		GardenArea secondTierB = new GardenArea(10, 10, "Tier2b");
		GardenArea secondTierC = new GardenArea(10, 10, "Tier2c");
		GardenArea secondTierD = new GardenArea(10, 10, "Tier2d");
		GardenArea secondTierE = new GardenArea(10, 10, "Tier2e");
		GardenArea secondTierF = new GardenArea(10, 10, "Tier2f");
		GardenArea firstTierA = new GardenArea(10, 10, "Tier1a");
		GardenArea firstTierB = new GardenArea(10, 10, "Tier1b");
		GardenArea firstTierC = new GardenArea(10, 10, "Tier1c");
		GardenArea topTier = new GardenArea(10, 10, "TopTier");
		
		topTier.addGarden(firstTierA);
		topTier.addGarden(firstTierB);
		topTier.addGarden(firstTierC);
		firstTierA.addGarden(secondTierA);
		firstTierB.addGarden(secondTierB);
		
		System.out.print("Printing all gardens contained in topTier garden: \n");
		topTier.printGardens();
		
		
	}

	public static List<String> getPlantList() {
		return plantList;
	}

	public void setPlantList(List<String> plantList) {
		Assignment3Test.plantList = plantList;
	}

}
