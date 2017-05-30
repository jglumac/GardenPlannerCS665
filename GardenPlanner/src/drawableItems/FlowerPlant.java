package drawableItems;

public class FlowerPlant extends Plant{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Flower draw method. Flower:" + this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}
}
