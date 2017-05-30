package drawableItems;

import java.awt.Color;

import Mediators.PlantCompatabilityMediator;

public abstract class Plant extends GardenObject implements IPlant{
	

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Base Plant draw method. \n");
	}
	
	public void onSelect(){
		PlantCompatabilityMediator.evaluateAvailableList(this);
	}

	
}
