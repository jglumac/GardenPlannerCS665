package drawableItems;

public class PlantFactory extends AbstractFactory{

	private static PlantFactory instance = new PlantFactory();
	
	private PlantFactory(){};
	
	public static PlantFactory getInstance(){
		return instance;
	}
	
	@Override
	public Plant getPlant(String plantType) {
		// TODO Auto-generated method stub
		if(plantType==null){
			return null;
		}
		
		if(plantType.equalsIgnoreCase("Herb")){
			return new HerbPlant();
		}
		else if(plantType.equalsIgnoreCase("Flower")){
			return new FlowerPlant();
		}
		else if(plantType.equalsIgnoreCase("Vegetable")){
			return new VegetablePlant();
		}
		else if(plantType.equalsIgnoreCase("Fruit")){
			return new FruitPlant();
		}
		else if(plantType.equalsIgnoreCase("Tree")){
			return new TreePlant();
		}
		else if(plantType.equalsIgnoreCase("Shrub")){
			return new ShrubPlant();
		}
		
		return null;
	}

	@Override
	public Structure getStructure(String structureType) {
		// TODO Auto-generated method stub
		return null;
	}

		
}
