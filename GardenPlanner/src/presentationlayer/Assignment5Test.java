package presentationlayer;

import java.awt.Color;
import java.util.Scanner;

import businesslayer.AddObjectCommand;
import businesslayer.GardenObject;

public class Assignment5Test {

	public static void main(String[] args) {
		
		GardenAreaView garden = GardenAreaView.getInstance();
		AvailableMenuView available = AvailableMenuView.getInstance();
		
		System.out.print("Testing layered architecture using facade...\n\n");
		
		System.out.print("\nTesting Garden UI: \n");	
		String userInput="x";
		while(!userInput.equalsIgnoreCase("e")){
			available.draw();			
		    Scanner scanner = new Scanner(System.in);
			System.out.print("\nEnter a plant to add to the garden, type u to undo, or type e to exit: \n");
			userInput = scanner.next();
			if(userInput.equalsIgnoreCase("u")){
				garden.undo();
				garden.drawGarden();
			}
			else if(!userInput.equalsIgnoreCase("e")){
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
}
