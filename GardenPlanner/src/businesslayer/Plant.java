package businesslayer;

import java.awt.Color;

public abstract class Plant extends GardenObject implements IPlant{
	
	abstract void morning();
	abstract void day();
	abstract void night();
	
	@Override
	public void draw() {
		
		System.out.print("Base Plant draw method. \n");
	}
	
	public void onSelect(){
		PlantCompatabilityMediator.evaluateAvailableList(this);
	}

	public final void waterSchedule(){
		morning();
		day();
		night();
	}
	
}
