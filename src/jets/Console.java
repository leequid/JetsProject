package jets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	Scanner kb = new Scanner(System.in);
	Hangar way = new Hangar();

	public void run() {

		menuSelect();
	}

	public void addJetInputAndPrompt() {
		
		try{
		String jetName;
		double jetSpeed;
		double jetRange;
		int jetCapacity;
		double jetPrice;
		kb.nextLine();
	
		
		System.out.print("Please type in the name of the Jet: ");
		jetName = kb.nextLine();
		System.out.print("Please type in the speed of the Jet (mph) : ");
		jetSpeed = kb.nextDouble();
		System.out.print("Please type in the range of the Jet (mile) :");
		jetRange = kb.nextDouble();
		System.out.print("Please type in the capacity of the Jet (people) : ");
		jetCapacity = kb.nextInt();
		System.out.print("Please type in the price of the Jet (dollars) : ");
		jetPrice = kb.nextDouble();
		System.out.println();
		Jets addJet = new Jets(jetName, jetSpeed, jetRange, jetCapacity, jetPrice, null);
		way.addJets(addJet);
		}
		catch(InputMismatchException e){
			System.out.println("You have entered an invalid input. Please try again.");
			addJetInputAndPrompt();
		}
		
		
		


	}

	public void menuSelect() {

		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("|      AIRBASE HANGAR MANAGE      |");
			System.out.println("-----------------------------------");
			System.out.println("| 1. List Fleet                   |");
			System.out.println("| 2. View Fastest Jet             |");
			System.out.println("| 3. View Jet with longest range  |");
			System.out.println("| 4. Add a jet to Fleet           |");
			System.out.println("| 5. Quit                         |");
			System.out.println("|_________________________________|");
			System.out.print("Please select from option (1~5): ");

			int num = kb.nextInt();

			switch (num) {
			case 1:
				way.printJetList();
				break;

			case 2:
				way.maxSpeed();
				break;

			case 3:
				way.maxRange();
				break;

			case 4:
				addJetInputAndPrompt();
				break;

			case 5:
				kb.close();
				return;

			}
		}
	}

}
