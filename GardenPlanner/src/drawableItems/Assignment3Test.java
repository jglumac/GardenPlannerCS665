package drawableItems;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import area.AddObjectCommand;
import area.AvailableMenu;
import area.CommandManager;
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
		
		CommandManager commManager = new CommandManager();
		
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
	
		GardenArea garden = new GardenArea(10, 10, "Jon's Garden");
		AvailableMenu menu = AvailableMenu.getInstance();
		
		GardenObject rosemaryClone = GardenObjectCache.getGardenObject("Herb");
		menu.addItem(createPlant(rosemaryClone,"Rosemary"));
		GardenObject thymeClone = GardenObjectCache.getGardenObject("Herb");
		menu.addItem(createPlant(thymeClone,"Thyme"));
		GardenObject dillClone = GardenObjectCache.getGardenObject("Herb");
		menu.addItem(createPlant(dillClone,"Dill"));
		GardenObject fennelClone = GardenObjectCache.getGardenObject("Herb");
		menu.addItem(createPlant(fennelClone,"Fennel"));
		GardenObject borageClone = GardenObjectCache.getGardenObject("Herb");
		menu.addItem(createPlant(borageClone,"Borage"));
		GardenObject carrotClone = GardenObjectCache.getGardenObject("Vegetable");
		menu.addItem(createPlant(carrotClone,"Carrot"));
		GardenObject tomatoClone = GardenObjectCache.getGardenObject("Vegetable");
		menu.addItem(createPlant(tomatoClone,"Tomato"));
		GardenObject cucumberClone = GardenObjectCache.getGardenObject("Vegetable");
		menu.addItem(createPlant(cucumberClone,"Cucumber"));
		GardenObject chiveClone = GardenObjectCache.getGardenObject("Vegetable");
		menu.addItem(createPlant(chiveClone,"Chive"));
		GardenObject strawberryClone = GardenObjectCache.getGardenObject("Fruit");
		menu.addItem(createPlant(strawberryClone,"Strawberry"));		
		GardenObject raspberryClone = GardenObjectCache.getGardenObject("Fruit");
		menu.addItem(createPlant(raspberryClone,"Raspberry"));
		GardenObject yarrowClone = GardenObjectCache.getGardenObject("Flower");
		menu.addItem(createPlant(yarrowClone,"Yarrow"));
		GardenObject nasturtiumClone = GardenObjectCache.getGardenObject("Flower");
		menu.addItem(createPlant(nasturtiumClone,"Nasturtium"));
		GardenObject calendulaClone = GardenObjectCache.getGardenObject("Flower");
		menu.addItem(createPlant(calendulaClone,"Calendula"));
		
		
		
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
		
		System.out.print("\nTesting Garden UI: \n");	
		String userInput="x";
		while(!userInput.equalsIgnoreCase("e")){
			System.out.print("\nAvailable objects: \n");
			Iterator iter = menu.getAvailableList().entrySet().iterator();
			while(iter.hasNext()){
				Map.Entry pair = (Map.Entry)iter.next();
				System.out.print("" + pair.getKey() + ") ");
				((GardenObject) pair.getValue()).draw();
			}
			
		    Scanner scanner = new Scanner(System.in);
			System.out.print("\nEnter a plant to add to the garden, type u to undo, or type e to exit: \n");
			userInput = scanner.next();
			if(userInput.equalsIgnoreCase("u")){
				commManager.Undo();
				garden.drawGarden();
			}
			else if(!userInput.equalsIgnoreCase("e")){
				try {
					System.out.print("User selected: " + menu.getAvailableList().get(Integer.parseInt(userInput)).getName() + "\n");
					GardenObject newGO = (GardenObject) menu.getAvailableList().get(Integer.parseInt(userInput)).clone();
					newGO.setColor(Color.YELLOW);
					commManager.ExecuteCommand(new AddObjectCommand(garden, newGO));
					garden.drawGarden();
				} catch (NumberFormatException e) {
					System.out.print("Invalid input, please use valid entry. \n");
				}
			}

		}
		
	}

	private static GardenObject createPlant(GardenObject clone, String type) {
		// TODO Auto-generated method stub
		switch(type){
			case "Rosemary":
				clone.setName(type);
				clone.setDiameter(6.0);
				clone.setColor(Color.yellow);
				break;
			case "Thyme":
				clone.setName(type);
				clone.setDiameter(4.0);
				clone.setColor(Color.yellow);
				break;
			case "Dill":
				clone.setName(type);
				clone.setDiameter(4.0);
				clone.setColor(Color.yellow);
				clone.setBadPlants(new HashSet<String>(Arrays.asList("Carrot", "Fennel")));		
				break;
			case "Fennel":
				clone.setName(type);
				clone.setDiameter(6.0);
				clone.setColor(Color.yellow);
				clone.setBadPlants(new HashSet<String>(Arrays.asList("Carrot", "Dill")));
				break;
			case "Carrot":
				clone.setName(type);
				clone.setDiameter(4.0);
				clone.setColor(Color.yellow);
				clone.setBadPlants(new HashSet<String>(Arrays.asList("Fennel", "Dill")));
				clone.setCompanionPlants(new HashSet<String>(Arrays.asList("Tomato")));
				break;
			case "Tomato":
				clone.setName(type);
				clone.setDiameter(12.0);
				clone.setColor(Color.yellow);
				clone.setCompanionPlants(new HashSet<String>(Arrays.asList("Carrot")));
				break;
			case "Cucumber":
				clone.setName(type);
				clone.setDiameter(24.0);
				clone.setColor(Color.yellow);
				break;
			case "Borage":
				clone.setName(type);
				clone.setDiameter(6.0);
				clone.setColor(Color.yellow);
				break;
			case "Strawberry":
				clone.setName(type);
				clone.setDiameter(6.0);
				clone.setColor(Color.yellow);
				break;
			case "Raspberry":
				clone.setName(type);
				clone.setDiameter(12.0);
				clone.setColor(Color.yellow);
				break;
			case "Yarrow":
				clone.setName(type);
				clone.setDiameter(8.0);
				clone.setColor(Color.yellow);
				break;
			case "Nasturtium":
				clone.setName(type);
				clone.setDiameter(6.0);
				clone.setColor(Color.yellow);
				break;
			case "Calendula":
				clone.setName(type);
				clone.setDiameter(3.0);
				clone.setColor(Color.yellow);
				break;
			case "Chive":
				clone.setName(type);
				clone.setDiameter(2.0);
				clone.setColor(Color.yellow);
				break;
		}
		
		return clone;	
	}
	
	public static List<String> getPlantList() {
		return plantList;
	}

	public void setPlantList(List<String> plantList) {
		Assignment3Test.plantList = plantList;
	}

}
