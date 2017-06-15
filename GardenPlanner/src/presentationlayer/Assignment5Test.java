package presentationlayer;

import java.util.Scanner;

public class Assignment5Test {

	public static void main(String[] args) {
		
		
		System.out.print("Testing layered architecture using facade...\n\n");
		
		System.out.print("\nTesting Garden UI: \n");	
		String userInput="x";
		while(!userInput.equalsIgnoreCase("e")){
			System.out.print("\nAvailable objects: \n");
			AvailableMenuView.getInstance().draw();
		    Scanner scanner = new Scanner(System.in);
			System.out.print("\nEnter a plant to add to the garden, type u to undo, or type e to exit: \n");
			userInput = scanner.next();
			if(userInput.equalsIgnoreCase("u")){

			}
			else if(!userInput.equalsIgnoreCase("e")){

			}

		}
		
	}
}
