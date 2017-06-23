package businesslayer;

public abstract class Structure extends GardenObject implements IStructure {

	@Override
	public void draw() {
		
		System.out.print("Base structure draw method. \n");
	}
	
}
