package businesslayer;

public class FruitPlant extends Plant{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}

	@Override
	void morning() {
		// TODO Auto-generated method stub
		System.out.print("Water in the morning.\n");
	}

	@Override
	void day() {
		// TODO Auto-generated method stub
		System.out.print("Water in the hottest part of the day.\n");
	}

	@Override
	void night() {
		// TODO Auto-generated method stub
		System.out.print("Water at night.\n");
		
	}
}
