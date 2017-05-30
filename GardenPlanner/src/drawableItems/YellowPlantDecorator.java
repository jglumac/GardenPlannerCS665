package drawableItems;

import java.awt.Color;

public class YellowPlantDecorator extends PlantDecorator {

	public YellowPlantDecorator(Plant decoratedPlant) {
		super(decoratedPlant);
		// TODO Auto-generated constructor stub
		this.draw();
	}

	public void draw(){
		setColor(this.decoPlant);
		decoPlant.draw();
	}
	
	public void setColor(Plant decoratedPlant){
		decoratedPlant.setColor(Color.YELLOW);
	}
}
