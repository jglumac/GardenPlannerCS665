package presentationlayer;


public class GardenAreaView {
	
	private static GardenAreaView instance = new GardenAreaView();
	PresentationLayerFacade presentation = PresentationLayerFacade.getInstance();
	
	public static GardenAreaView getInstance(){
		return instance;
	}
	
	private GardenAreaView(){
		
	}
	
	public void undo(){
		presentation.undoCommand();
	}
	
	public void addToGarden(String userInput){
		presentation.addToGarden(userInput);
	}
	
	public void drawGarden(){
		presentation.drawGarden();
	}
	
	public void setGardenName(String name){
		presentation.setGardenName(name);
	}
	
}
