package businesslayer;

public class VegetablePlant extends Plant{

	@Override
	public void draw() {
		
		System.out.print(this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}

	@Override
	void morning() {
		
		
	}

	@Override
	void day() {
		
		
	}

	@Override
	void night() {
		
		
	}
}
