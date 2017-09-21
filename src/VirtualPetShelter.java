
public class VirtualPetShelter {

	String petName;

	int hunger = 100;
	int thirst = 100;
	int waste = 100;
	int boredom = 100;

	boolean petIsAlive(String petName) {
		if (hunger > 0 && thirst > 0 && waste < 150 && boredom > 0) {
			return true;
		}
		return false;
	}

	void food() {
		hunger += 10;
		thirst -= 5;
		waste += 15;
		boredom += 10;
	}

	void liquid() {
		hunger += 0;
		thirst += 10;
		waste += 10;
		boredom += 5;
	}

	void potty() {
		hunger += 0;
		thirst += 0;
		waste -= 20;
		boredom += 5;
	}

	void play() {
		hunger += 15;
		thirst += 20;
		waste += 1;
		boredom -= 20;
	}

	void tick() {
		hunger -= 2;
		thirst += 2;

		waste += 2;
		boredom += 2;
	}
}
