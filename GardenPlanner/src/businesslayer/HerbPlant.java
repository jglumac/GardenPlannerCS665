package businesslayer;

public class HerbPlant extends Plant{

	@Override
	public void draw() {
		
		System.out.print(this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}

	@Override
	void morning() {
		
		
	}

	@Override
	void day() {
		
		System.out.print("Water at the hottest time of the day.\n");
	}

	@Override
	void night() {
		
		
	}
}
