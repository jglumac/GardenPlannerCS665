package drawableItems;

public abstract class AbstractFactory {
	
	public abstract Plant getPlant(String plantType);
	public abstract Structure getStructure(String structureType);
	
}
