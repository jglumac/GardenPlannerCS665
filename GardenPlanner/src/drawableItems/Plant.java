package drawableItems;

import java.awt.Color;

import Mediators.PlantCompatabilityMediator;

public abstract class Plant extends GardenObject implements IPlant{
	
	abstract void morning();
	abstract void day();
	abstract void night();
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
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
