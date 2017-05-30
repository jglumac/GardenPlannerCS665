package drawableItems;

public class FruitPlant extends Plant{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Fruit draw method. Fruit:" + this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}
}
