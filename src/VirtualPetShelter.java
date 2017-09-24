import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class VirtualPetShelter {

	Map<String, VirtualPet2> shelter = new HashMap<>();

	public VirtualPet2 getName(String petName) {
		return shelter.get(petName);
	}

	public Collection<VirtualPet2> allPets() {
		return shelter.values();
	}

	public void addPet(VirtualPet2 newPet) {
		shelter.put(newPet.getName(), newPet);
	}

	public void removePet(String adoptedPet) {
		shelter.remove(adoptedPet);
	}

	public void feedPets() {
		for (VirtualPet2 feedAll : shelter.values()) {
			feedAll.food();
		}
	}

	public void hydratePets() {
		for (VirtualPet2 hydrateAll : shelter.values()) {
			hydrateAll.liquid();
		}
	}

	public void playOnePet(VirtualPet2 playOnePet) {
		playOnePet.play();
	}

	public void timeTick() {
		for (VirtualPet2 tickAll : shelter.values()) {
			tickAll.tick();
		}

	}
}
