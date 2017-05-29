package drawableItems;

public abstract class AbstractFactory {
	
	abstract Plant getPlant(String plantType);
	abstract Structure getStructure(String structureType);
	
}
