package businesslayer;

import java.awt.Color;

public class GreenPlantDecorator extends PlantDecorator{

	public GreenPlantDecorator(Plant decoratedPlant) {
		super(decoratedPlant);
		// TODO Auto-generated constructor stub
		this.draw();
	}

	public void draw(){
		setColor(this.decoPlant);
		decoPlant.draw();
	}
	
	public void setColor(Plant decoratedPlant){
		decoratedPlant.setColor(Color.GREEN);
	}
}
