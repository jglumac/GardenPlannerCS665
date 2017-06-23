package businesslayer;

public class StructureFactory extends AbstractFactory {

	public static StructureFactory instance = new StructureFactory();
	
	private StructureFactory(){};
	
	public static StructureFactory getInstance(){
		return instance;
	}
	
	
	@Override
	public Plant getPlant(String plantType) {
		return null;
	}

	@Override
	public Structure getStructure(String structureType) {
		
		if(structureType==null){
			return null;
		}
		
		if(structureType=="Trellis"){
			return new TrellisSupport();
		}
		else if(structureType == "Stake"){
			return new StakeSupport();
		}
		
		return null;
		
	}

}
