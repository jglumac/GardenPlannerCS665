package drawableItems;

import java.awt.Color;

public class GardenObject implements Cloneable {

	public String name = "";
	public double diameter;
	public double posX;
	public double posY;
	public Color color = Color.YELLOW;
	

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

	   public Object clone() {
		      Object clone = null;
		      
		      try {
		         clone = super.clone();
		        
		         
		      } catch (CloneNotSupportedException e) {
		         e.printStackTrace();
		      }
		      
		      return clone;
	   }

	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
