import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter coopersShelter = new VirtualPetShelter();
		VirtualPet2 spanky = new VirtualPet2("Spanky", "Male Labrador", 50, 50, 10, 20);
		VirtualPet2 careBear = new VirtualPet2("Care", "Female Labrador", 50, 50, 10, 20);
		VirtualPet2 cooper = new VirtualPet2("Cooper", "Male Labrador", 40, 50, 20, 30);

		coopersShelter.addPet(spanky);
		coopersShelter.addPet(careBear);
		coopersShelter.addPet(cooper);

		// Boolean goToShelter = false;
		// while (!goToShelter) {
		while (!coopersShelter.shelter.isEmpty()) {

			System.out.println("Welcome to Cooper's Virtual Pet Shelter!!");
			System.out.println();
			System.out.println("This is the status of our available pets:");
			System.out.println();
			System.out.println("Name \t|Hunger |Thirst |Boredom");
			System.out.println("-----\t|-------|-------|------");
			for (VirtualPet2 pets : coopersShelter.allPets()) {
				System.out.println(pets.getName() + "\t|" + pets.getHunger() + "\t|" + pets.getThirst() + "\t|"
						+ pets.getBoredom());
			}
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("Press 1 to Feed the pets.");
			System.out.println("Press 2 to Give the pets water.");
			System.out.println("Press 3 to Play with the Pets");
			System.out.println("Press 4 to Adopt a Pet");
			System.out.println("Press 5 to Donate a Pet.");
			System.out.println("Press 6 to Leave the Shelter.");
			int userOption = input.nextInt();

			while (userOption != 1 && userOption != 2 && userOption != 3 && userOption != 4 && userOption != 5)
				;
			;

			switch (userOption) {

			case 1:
				coopersShelter.feedPets();
				System.out.println("Thank you for feeding the pets!");
				break;

			case 2:
				coopersShelter.hydratePets();
				System.out.println("Thank you for giving th epets some liquid!");
				break;

			case 3:
				System.out.println("Which pet would you like to play with?");
				System.out.println("Enter their name to continue.");
				for (VirtualPet2 currentPet : coopersShelter.allPets()) {
					System.out.println(currentPet.petName + ", the " + currentPet.description);
				}
				String petToPlayWith = input.next.equalsIgnoreCase();
				coopersShelter.getName(petToPlayWith).play();
				System.out.println("You played with " + petToPlayWith);
				break;
			//
			// case 4:
			// System.out.println(digiPet.petName + " Says, Woo Hoo!! We get to play!");
			// digiPet.play();
			// digiPet.tick();
			// System.out.println("\n" + digiPet.petName + "'s bladder is now at: " +
			// (digiPet.waste) + "\n");
			// break;
			//
			// }
			// if (!digiPet.petIsAlive(digiPet.petName)) {
			// System.out.println("You KILLED " + digiPet.petName + "! You BASTARD!!!!");
			//
			}

		}
		input.close();

	}
}

//

//
//
//
//
//
// while (digiPet.petIsAlive(digiPet.petName)) {
// int userOpt;
//
// do {
// System.out.println("What do you want to do? \n");
// System.out.println("Press 1 to Feed " + digiPet.petName);
// System.out.println("Press 2 to Give " + digiPet.petName + " liuid");
// System.out.println("Press 3 to Take " + digiPet.petName + " to the potty");
// System.out.println("Press 4 to Play with " + digiPet.petName);
// System.out.println("Press 5 to Do nothing with " + digiPet.petName);
// userOpt = input.nextInt();
//
// } while (userOpt != 1 && userOpt != 2 && userOpt != 3 && userOpt != 4 &&
// userOpt != 5);
//
// switch (userOpt) {
//
// case 1:
// System.out.println(digiPet.petName + " thanks you for that tasty morsal!");
// digiPet.food();
// digiPet.tick();
// System.out.println("\n" + digiPet.petName + "'s hunger is now at: " +
// (digiPet.hunger) + "\n");
// break;
//
// case 2:
// System.out.println(digiPet.petName + " Says, Finally! I was dieing of
// thirst!");
// digiPet.liquid();
// digiPet.tick();
// System.out.println("\n" + digiPet.petName + "'s thirst is now at: " +
// (digiPet.thirst) + "\n");
// break;
//
// case 3:
// System.out.println(digiPet.petName + " Says, THANK YOU! THANK YOU! I thought
// I was going to explode!");
// digiPet.potty();
// digiPet.tick();
// System.out.println("\n" + digiPet.petName + "'s bladder is now at: " +
// (digiPet.waste) + "\n");
// break;
//
// case 4:
// System.out.println(digiPet.petName + " Says, Woo Hoo!! We get to play!");
// digiPet.play();
// digiPet.tick();
// System.out.println("\n" + digiPet.petName + "'s bladder is now at: " +
// (digiPet.waste) + "\n");
// break;
//
// }
// if (!digiPet.petIsAlive(digiPet.petName)) {
// System.out.println("You KILLED " + digiPet.petName + "! You BASTARD!!!!");
//
// }
//
// }
// input.close();
// }
//
// }
