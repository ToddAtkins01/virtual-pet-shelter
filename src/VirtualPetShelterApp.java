import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPet digiPet = new VirtualPet();

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to this AWESOME Virtual Pet App!! \nPlease name your pet.");
		digiPet.petName = input.next();

		while (digiPet.petIsAlive(digiPet.petName)) {
			int userOpt;

			do {
				System.out.println("What do you want to do? \n");
				System.out.println("Press 1 to Feed " + digiPet.petName);
				System.out.println("Press 2 to Give " + digiPet.petName + " liuid");
				System.out.println("Press 3 to Take " + digiPet.petName + " to the potty");
				System.out.println("Press 4 to Play with " + digiPet.petName);
				System.out.println("Press 5 to Do nothing with " + digiPet.petName);
				userOpt = input.nextInt();

			} while (userOpt != 1 && userOpt != 2 && userOpt != 3 && userOpt != 4 && userOpt != 5);

			switch (userOpt) {

			case 1:
				System.out.println(digiPet.petName + " thanks you for that tasty morsal!");
				digiPet.food();
				digiPet.tick();
				System.out.println("\n" + digiPet.petName + "'s hunger is now at: " + (digiPet.hunger) + "\n");
				break;

			case 2:
				System.out.println(digiPet.petName + " Says, Finally! I was dieing of thirst!");
				digiPet.liquid();
				digiPet.tick();
				System.out.println("\n" + digiPet.petName + "'s thirst is now at: " + (digiPet.thirst) + "\n");
				break;

			case 3:
				System.out.println(digiPet.petName + " Says, THANK YOU! THANK YOU! I thought I was going to explode!");
				digiPet.potty();
				digiPet.tick();
				System.out.println("\n" + digiPet.petName + "'s bladder is now at: " + (digiPet.waste) + "\n");
				break;

			case 4:
				System.out.println(digiPet.petName + " Says, Woo Hoo!! We get to play!");
				digiPet.play();
				digiPet.tick();
				System.out.println("\n" + digiPet.petName + "'s bladder is now at: " + (digiPet.waste) + "\n");
				break;

			}
			if (!digiPet.petIsAlive(digiPet.petName)) {
				System.out.println("You KILLED " + digiPet.petName + "! You BASTARD!!!!");

			}

		}
		input.close();
	}

}
