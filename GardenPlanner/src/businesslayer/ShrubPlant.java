package businesslayer;

public class ShrubPlant extends Plant{

	
	@Override
	public void draw() {
		
		System.out.print("Shrub draw method. Shrub:" + this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}

	@Override
	void morning() {
		
		
	}

	@Override
	void day() {
		
		
	}

	@Override
	void night() {
		
		
	}
}
