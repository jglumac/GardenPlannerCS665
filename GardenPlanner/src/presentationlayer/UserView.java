package presentationlayer;

public class UserView {

	private static UserView instance = new UserView();
	PresentationLayerFacade presentation = PresentationLayerFacade.getInstance();
	


	public static UserView getInstance(){
		return instance;
	}
	
	private UserView(){
		
	}
	
	public int getGardensByUserID(String userName){
		return presentation.getGardensByUserID(userName);
	}
	
	public void drawUserGardens(){
		presentation.drawUserGardens();
	}
}
