package presentationlayer;

import java.util.Iterator;
import java.util.Map;

import businesslayer.GardenObject;

public class AvailableMenuView {

	private static AvailableMenuView instance = new AvailableMenuView();
	PresentationLayerFacade presentation = PresentationLayerFacade.getInstance();
	
	public static AvailableMenuView getInstance(){
		return instance;
	}
	
	private AvailableMenuView(){
		
	}
	
	public void draw(){
		System.out.print("\nAvailable objects: \n");
		presentation.drawAvailableMenu();
	}
	
	public void displayUsersSelection(String userInput){
		presentation.displayUsersSelection(userInput);
	}
	
}
