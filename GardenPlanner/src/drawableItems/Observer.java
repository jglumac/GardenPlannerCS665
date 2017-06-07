package drawableItems;

import area.GardenArea;

public abstract class Observer {
	   protected GardenArea garden;
	   public abstract void update(GardenObject gardenObject);
	   public abstract void updateGood(GardenObject gardenObject);
}
