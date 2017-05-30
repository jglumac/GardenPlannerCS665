package drawableItems;

public class HerbPlant extends Plant{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Herb draw method. Herb:" + this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}
}
