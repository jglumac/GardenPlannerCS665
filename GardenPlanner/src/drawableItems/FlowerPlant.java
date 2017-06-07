package drawableItems;

public class FlowerPlant extends Plant{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
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
		System.out.print("Water at night.\n");
		
	}
}
