package businesslayer;

public abstract class PlantDecorator implements IPlant{

   protected Plant decoPlant;

   public PlantDecorator(Plant decoPlant){
      this.decoPlant = decoPlant;
   }

	@Override
	public void draw() {
		
		
	}

}
