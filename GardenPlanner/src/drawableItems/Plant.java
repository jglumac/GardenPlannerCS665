package drawableItems;

import java.awt.Color;

import Mediators.PlantCompatabilityMediator;

public class Plant implements IPlant{
	
	public String name;
	public double diameter;
	public double posX;
	public double posY;
	public Color color;
	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Base Plant draw method. \n");
	}
	
	public void onSelect(){
		PlantCompatabilityMediator.evaluateAvailableList(this);
	}
	
}
