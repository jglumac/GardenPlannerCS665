package drawableItems;

import java.util.ArrayList;
import java.util.List;

public class Assignment2Test {

	public static List<String> plantList = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Testing...\n\n");
		
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
		
	}

	public static List<String> getPlantList() {
		return plantList;
	}

	public void setPlantList(List<String> plantList) {
		Assignment2Test.plantList = plantList;
	}

}
