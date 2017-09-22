
public class VirtualPet2 {

	String petName;
	String discription;
	int hunger;
	int thirst;
	int waste;
	int boredom;

	public VirtualPet2(String petName, String discription, int hunger, int thirst, int waste, int boredom) {
		this.petName = petName;
		this.discription = discription;
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
	}

	public String getName() {
		return petName;
	}

	public VirtualPet2(String petName, String discription) {
		this.petName = petName;
		this.discription = discription;
		this.hunger = 100;
		this.thirst = 100;
		this.waste = 100;
		this.boredom = 100;
	}

	boolean petIsAlive(String petName) {
		return (hunger > 0 && thirst > 0 && waste < 150 && boredom > 0);
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
