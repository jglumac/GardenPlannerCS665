package businesslayer;

public class ShrubPlant extends Plant{

	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Shrub draw method. Shrub:" + this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}

	@Override
	void morning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void day() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void night() {
		// TODO Auto-generated method stub
		
	}
}
