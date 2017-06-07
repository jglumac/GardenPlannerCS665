package drawableItems;

public class FruitPlant extends Plant{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}
}
