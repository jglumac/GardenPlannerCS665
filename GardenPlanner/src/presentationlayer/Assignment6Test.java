package presentationlayer;

import java.util.Scanner;

public class Assignment6Test {

	public static void main(String[] args) {
		
		String userInput="x";
		GardenAreaView garden = GardenAreaView.getInstance();
		AvailableMenuView available = AvailableMenuView.getInstance();
		UserView user = UserView.getInstance();
		String gardenName;
		
		System.out.print("Testing layered architecture using facade...\n\n");
		
		System.out.print("\nTesting Garden UI: \n");	
		
		while(!userInput.equalsIgnoreCase("E")){
		    Scanner scanner = new Scanner(System.in);
			System.out.print("Enter user name: \n");
			userInput = scanner.nextLine();
			
			int gNum = user.getGardensByUserID(userInput);
			user.drawUserGardens();
			if(gNum>0){
				System.out.println("Select an existing garden to edit or type C to create a new garden.");
				userInput = scanner.nextLine();
			}
			else{
				userInput = "C";
			}
			
			if(userInput.equalsIgnoreCase("C")){
				
				System.out.println("Enter name for new garden: ");
				gardenName = scanner.nextLine();
				garden.setGardenName(gardenName);
				
				while(!userInput.equalsIgnoreCase("E")&&!userInput.equalsIgnoreCase("S")){
					available.draw();			
		
					printMenu();
					userInput = scanner.next();
					if(userInput.equalsIgnoreCase("U")){
						garden.undo();
						garden.drawGarden();
					}
					else if(userInput.equalsIgnoreCase("S")){
						garden.save();
					}
					else if(!userInput.equalsIgnoreCase("E")){
						try {
							available.displayUsersSelection(userInput);
							garden.addToGarden(userInput);
							garden.drawGarden();
						} catch (NumberFormatException e) {
							System.out.print("Invalid input, please use valid entry. \n");
						}
					}
	
		
				}
			}
			else{
				//load existing garden
			}
		}
		
	}
	
	public static void printMenu(){
		System.out.print("\nMenu Options: \n" + "   Select a number to add a plant to the garden\n   U: undo\n   S: save garden\n   E: exit: \n");
	}
	
}
