package jets;

import java.util.Scanner;

public class FleetTest {

	static Jet[] fleetinfo = new Jet[7];

	public static void main(String[] args) {

		fleetinfo[0] = new Jet("Gulfstream G650", 0.925F, 8053F, 65000000);
		fleetinfo[1] = new Jet("Cessna Citation X", 0.935F, 3701F, 20041800);
		fleetinfo[2] = new Jet("Dessault Falcon 7X", 0.90F, 6846.9F, 52300000);
		fleetinfo[3] = new Jet("Bombardier Global 6000", 0.89F, 7077.4F, 60500000);
		fleetinfo[4] = new Jet("Aerion AS2", 1.60F, 4750F, 100000000);

		fleetMenu();

	}

	public static void fleetMenu() {
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("**          WELCOME TO FLEET TOOL v1.62          **");
		System.out.println("***************************************************");
		System.out.println("**        (select menu option to continue)       **");
		System.out.println("***************************************************");
		System.out.println("**  1.  List Fleet                    (press 1)  **");
		System.out.println("**  2.  View fastest jet              (press 2)  **");
		System.out.println("**  3.  View jet with longest range   (press 3)  **");
		System.out.println("**  4.  Add a jet to Fleet            (press 4)  **");
		System.out.println("**  5.  Quit                          (press 5)  **");
		System.out.println("***************************************************");
		System.out.println("***************************************************");

		Scanner kb = new Scanner(System.in);

		while (true) {
			int choice = kb.nextInt();
			if (choice == 1) {
				listFleet();
			} else if (choice == 2) {
				fastestJet();
			} else if (choice == 3) {
				longestRange();
			} else if (choice == 4) {
				addJet();
			} else if (choice == 5) {
				System.exit(0);
			} else {
				System.err.println("Please Enter a valid menu option ( 1 - 5 ).  Try again!");

			}
			continue;
		}

	}

	static void listFleet() {

		fleetinfo[0] = new Jet("Gulfstream G650", 0.925F, 8053F, 65000000);
		fleetinfo[1] = new Jet("Cessna Citation X", 0.935F, 3701F, 20041800);
		fleetinfo[2] = new Jet("Dessault Falcon 7X", 0.90F, 6846.9F, 52300000);
		fleetinfo[3] = new Jet("Bombardier Global 6000", 0.89F, 7077.4F, 60500000);
		fleetinfo[4] = new Jet("Aerion AS2", 1.60F, 4750F, 100000000);

		for (int i = 0; i < fleetinfo.length; i++) {
			if (fleetinfo[i] != null) {
				System.out.println(fleetinfo[i]);
			}
		}
		returnToMenu();
	}

	static void fastestJet() {
		float topspeed;
		for (int i = 0; i < fleetinfo.length; i++) {
			if (fleetinfo[i].getSpeed() < 1.60) {
				topspeed = fleetinfo[i].getSpeed();
				System.out.println("The fastest jet in the fleet is: \n" + fleetinfo[4]);
			} else {
				System.out.println("The fastest jet in the fleet is: \n" + fleetinfo[i]);
			}
			returnToMenu();
		}

	}

	static void longestRange() {
		float toprange;
		for (int i = 0; i < fleetinfo.length; i++) {
			if (fleetinfo[i].getSpeed() < 8053) {
				toprange = fleetinfo[i].getSpeed();
				System.out.println("The jet with the longest range is: \n" + fleetinfo[0]);
			} else {
				System.out.println("The jet with the longest range is: \n" + fleetinfo[i]);
			}
			returnToMenu();
		}

	}

	public static void addJet() {
		Scanner kb = new Scanner(System.in);

		Jet jet = new Jet(null, 0, 0, 0);

		System.out.println("\nEnter jet model:");
		jet.model = kb.next();

		System.out.println("\nEnter jet top speed (MPH): ");
		jet.speed = kb.nextFloat();

		System.out.println("\nEnter jet range: ");
		jet.range = kb.nextFloat();

		System.out.println("\nEnter jet price: ");
		jet.price = kb.nextInt();

		jet.speed = (float) (jet.speed * 0.00130332);

		for (int i = 0; i < fleetinfo.length; i++) {
			if (fleetinfo[i] != null) {
			}
			int index = i++;

			fleetinfo[index] = new Jet(jet.model, jet.speed, jet.range, jet.price);

		}
		System.out.println("\n\n");
		System.out.println("Jet has been added to the fleet!");
		System.out.println("\n\n");
		returnToMenu();
	}

	static void returnToMenu() {

		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("**      Press \"1\" to return to main menu.      **");
		System.out.println("**                      OR                       **");
		System.out.println("**       Press \"2\" to exit the program.        **");
		System.out.println("***************************************************");
		System.out.println("***************************************************");

		Scanner kb = new Scanner(System.in);

		while (true) {
			int choice = kb.nextInt();
			if (choice == 1) {
				fleetMenu();
			} else if (choice == 2) {
				System.exit(0);
			} else {
				System.out.println("\n\n");
				System.err.println("Please Enter a valid menu option ( 1 or 2 ).  Try again!");
			}
			continue;
		}
	}
}
