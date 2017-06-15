package presentationlayer;

import businesslayer.AvailableMenu;
import businesslayer.BusinessLayerFacade;
import datalayer.DataLayerFacade;

public class PresentationLayerFacade {
	
	private static PresentationLayerFacade instance = new PresentationLayerFacade();
	private BusinessLayerFacade business = BusinessLayerFacade.getInstance();
	private String criteriaQuery; 
	
	public static PresentationLayerFacade getInstance(){
		return instance;
	}
	
	private PresentationLayerFacade(){
		
	}
	
	public void drawAvailableMenu(){
		business.drawAvailableMenu();
	}
	
	public String getCriteriaQuery() {
		return criteriaQuery;
	}

	public void setCriteriaQuery(String criteriaQuery) {
		this.criteriaQuery = criteriaQuery;
	}
	
	public void displayUsersSelection(String selection){
		business.displaySelection(selection);
	}
	
	public void addToGarden(String selection){
		business.addToGarden(selection);
	}
	
	public void drawGarden(){
		business.drawGarden();
	}
	
	public void undoCommand(){
		business.undoCommand();
	}

}
