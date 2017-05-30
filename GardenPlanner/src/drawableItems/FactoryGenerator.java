package drawableItems;

public class FactoryGenerator {

	public static AbstractFactory getFactory(String factory){
		
		if(factory.equalsIgnoreCase("Plant")){
			return PlantFactory.getInstance();
		}
		else if(factory.equalsIgnoreCase("Structure")){
			return StructureFactory.getInstance();
		}
		return null;
		
	}
}
