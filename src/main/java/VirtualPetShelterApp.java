import static org.hamcrest.Matchers.equalToIgnoringCase;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random statChangesOnTick = new Random();
		boolean continueWithApp = true;
		
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		Map<String, VirtualPet> pets = new HashMap<>();
		VirtualPet pet1 = new VirtualPet("Shadow", "well-behaved and intelligent Golden Retriever", 60,40,50);
		VirtualPet pet2 = new VirtualPet("Chance", "young and energetic American Bulldog", 50,50,40);
		VirtualPet pet3 = new VirtualPet("Sassy", "sassy Himalayan", 40,60,60);
		
		virtualPetShelter.addPet(pet1);
		virtualPetShelter.addPet(pet2);
		virtualPetShelter.addPet(pet3);
		
		
			System.out.println("");
			System.out.println("Welcome to Donny's Virtual Pet Shelter!");
			System.out.println("\nThis is the status of your pets: ");
			System.out.println("  Name  || Hunger | Thirst | Boredom |                   Description                 ||");
			System.out.println("********|*********|********|*********|***********************************************||");
			System.out.println(" Shadow |    60   |   40   |    50   |  Intelligent/well-mannered - Golden Retriever ||");
			System.out.println("Chance  |    50   |   50   |    40   |      Young/energetic - American Bulldog       ||");
			System.out.println(" Sassy  |    40   |   60   |    60   |           Savvy diva - Himalayan              ||");
		
			
			while (continueWithApp = true) {
			System.out.println("What would you like to do?");
			System.out.println("1 = feed / 2 = give water / 3 = play with a pet / 4 = adopt / 5 = surrender / 6 = Leave shelter");
			System.out.println("");
			
			
			
			String menuChoice = input.nextLine();
				if (menuChoice.equals("1")) {
					virtualPetShelter.feedPets();
					System.out.println("All of the pets in the shelter have been fed!");
					System.out.println("1");
					
				} else if (menuChoice.equals("2")) {
					virtualPetShelter.waterAllPets();
					System.out.println("All of the pets in the shelter have been given some water!");
					System.out.println("");
					
				} else if (menuChoice.equals("3")) {
					System.out.println("Which pet would you like to play with?");
////////////////////System.out.println("Shadow, Chance, or Sassy?");
					String petName = input.nextLine();
					virtualPetShelter.playWithAPet(petName);
					System.out.println("You played with " + petName + "!");
					System.out.println("");
					
				} else if (menuChoice.equals("4")) {
					System.out.println("Great! Which pet would you like to adopt?");
////////////////////String petName = input.nextLine();
					System.out.println("I'm sure " + petName + "has found an amazing new family!");
					
				} else if (menuChoice.equals("5")) {
					System.out.println("We have room for another pet in our shelter. Let me just ask you a few things about the pet you are surrendering to us...");
					System.out.println("");
					System.out.println("Their name?");
					String newPetName = input.nextLine();
					
				} else if (menuChoice.equals("6")) {
					System.out.println("Okay, bye!");
					System.exit(0);
					
//					for(int i =0; i < 100; i++)
//					{
//					    int answer = rn.nextInt(10) + 1;
//					    System.out.println(answer);
//					}
					
					
			
				}		
	
			}	
				
	}
}


