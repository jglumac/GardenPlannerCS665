package businesslayer;

public class FruitPlant extends Plant{

	@Override
	public void draw() {
		
		System.out.print(this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}

	@Override
	void morning() {
		
		System.out.print("Water in the morning.\n");
	}

	@Override
	void day() {
		
		System.out.print("Water in the hottest part of the day.\n");
	}

	@Override
	void night() {
		
		System.out.print("Water at night.\n");
		
	}
}
