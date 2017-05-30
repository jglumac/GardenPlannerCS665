package drawableItems;

public class TreePlant extends Plant{

	double maxTrunkDiameter;
	double undergrowthClearance;
	boolean supportsUndergrowth;

	public double getUndergrowthClearance() {
		return undergrowthClearance;
	}

	public void setUndergrowthClearance(double undergrowthClearance) {
		this.undergrowthClearance = undergrowthClearance;
	}

	public boolean isSupportsUndergrowth() {
		return supportsUndergrowth;
	}

	public void setSupportsUndergrowth(boolean supportsUndergrowth) {
		this.supportsUndergrowth = supportsUndergrowth;
	}

	public double getMaxTrunkDiameter() {
		return maxTrunkDiameter;
	}

	public void setMaxTrunkDiameter(double maxTrunkDiameter) {
		this.maxTrunkDiameter = maxTrunkDiameter;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Tree draw method. Tree:" + this.getName() + " Color:" + Constants.colorMap.get(this.getColor()) + "\n");
	}
	
}
