package presentationlayer;


public class GardenAreaView {
	private static GardenAreaView instance = new GardenAreaView();
	
	public static GardenAreaView getInstance(){
		return instance;
	}
	
	private GardenAreaView(){
		
	}
}
