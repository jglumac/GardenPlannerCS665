package businesslayer;

import java.awt.Color;
import java.util.Set;

public class GardenObject extends Observer implements Cloneable {

	public String name = "";
	public double diameter;
	public double posX;
	public double posY;
	public Color color = Color.YELLOW;
	public Set<String> companionPlants;
	public Set<String> badPlants;
	

	public Set<String> getCompanionPlants() {
		return companionPlants;
	}

	public void setCompanionPlants(Set<String> companionPlants) {
		this.companionPlants = companionPlants;
	}

	public Set<String> getBadPlants() {
		return badPlants;
	}

	public void setBadPlants(Set<String> badPlants) {
		this.badPlants = badPlants;
	}

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
		
		
	}

	@Override
	public void update(GardenObject gardenObject) {
		
		if(this.getBadPlants()!=null && this.getBadPlants().contains(gardenObject.getName())){
			this.setColor(Color.red);
		}
		
	}
	
	@Override
	public void updateGood(GardenObject gardenObject) {
		
		if(this.getCompanionPlants()!=null && this.getCompanionPlants().contains(gardenObject.getName()) && 
				this.getColor()!=Color.red){
			this.setColor(Color.green);
		}
		
	}
}
