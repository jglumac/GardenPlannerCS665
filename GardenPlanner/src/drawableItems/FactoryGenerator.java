package drawableItems;

public class FactoryGenerator {

	public static AbstractFactory getFactory(String factory){
		
		if(factory.equalsIgnoreCase("Plant")){
			return new PlantFactory();
		}
		else if(factory.equalsIgnoreCase("Structure")){
			return new StructureFactory();
		}
		return null;
		
	}
}
