package businesslayer;

public class AddObjectCommand extends Command {

	GardenArea gardenArea;
	GardenObject gardenObject;
	
	public AddObjectCommand(GardenArea garden, GardenObject newGO) {
		// TODO Auto-generated constructor stub
		this.gardenArea=garden;
		this.gardenObject=newGO;
	}

	
	@Override
	public void Execute() {
		
		gardenArea.addGardenObject(gardenObject);
	}

	@Override
	public void Undo() {
		
		gardenArea.getGardenObjects().remove(gardenObject);
		AvailableMenu.getInstance().resetColors();
		gardenArea.adjustColors();
	}

}
