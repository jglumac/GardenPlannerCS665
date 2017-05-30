package drawableItems;

public class ShrubPlant extends Plant{

	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Shrub draw method. Shrub:" + this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}
}
