package businesslayer;

import presentationlayer.GUItest;

public class PlantCompatabilityMediator {

	
	
	public static void evaluateAvailableList(){
		//Get set of used plants in garden and evaluate any compatability issues in the list of available plants
		//update list of available plants with colors
		
		System.out.print("Evaluating available list based on garden plants. \n");
	}
	
	public static void evaluateAvailableList(Plant selectedPlant){
		//Take selected plant and evaluate any compatability issues in the list of available plants
		//update list of available plants with colors
		
		System.out.print("Evaluating available list based on selected Plant: " + selectedPlant.getName() + " \n");
		
		//update plant list, which will change color of list but for now just adds to the list
		try{
			GUItest.getPlantList().add(selectedPlant.getName());
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}

		System.out.print("Added " + selectedPlant.getName() + " to list of available, now contains " + 
						GUItest.getPlantList().size() + " plants.\n");
		
	}
}
