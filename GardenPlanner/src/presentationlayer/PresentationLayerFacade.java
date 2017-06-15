package presentationlayer;

import businesslayer.AvailableMenu;
import businesslayer.BusinessLayerFacade;
import datalayer.DataLayerFacade;

public class PresentationLayerFacade {
	
	private static PresentationLayerFacade instance = new PresentationLayerFacade();
	private BusinessLayerFacade business = BusinessLayerFacade.getInstance();
	private AvailableMenu menu;
	private String criteriaQuery; 
	
	public static PresentationLayerFacade getInstance(){
		return instance;
	}
	
	private PresentationLayerFacade(){
		setAvailableMenu(this.criteriaQuery);
	}
	
	private  void setAvailableMenu(String query){
		this.setMenu(business.getAvailableMenu(query));
	}

	public AvailableMenu getMenu() {
		return menu;
	}

	public void setMenu(AvailableMenu menu) {
		this.menu = menu;
	}
	public String getCriteriaQuery() {
		return criteriaQuery;
	}

	public void setCriteriaQuery(String criteriaQuery) {
		this.criteriaQuery = criteriaQuery;
	}
	
	

}
