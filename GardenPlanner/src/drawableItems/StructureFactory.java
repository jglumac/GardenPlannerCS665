package drawableItems;

public class StructureFactory extends AbstractFactory {

	@Override
	public Plant getPlant(String plantType) {
		return null;
	}

	@Override
	public Structure getStructure(String structureType) {
		// TODO Auto-generated method stub
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
