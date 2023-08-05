package robopet;

import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, Pet> shelterMap = new HashMap<>();
	int choice2;
	String petName;
	String description;
	boolean canine;
	String pet;

	public void addPet() {

		System.out.println("Enter Pet Name");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");

		System.out.println("1)  Add as Organic Dog\r\n" + //
				"\r\n" + //
				"2)  Add as Organic Cat\r\n" + //
				"\r\n" + //
				"3)  Add as Robotic Dog\r\n" + //
				"\r\n" + //
				"4)  Add as Robotic Cat\r\n" + //
				"\r\n" + //
				"");

		KeyboardInput num1 = new KeyboardInput();
		choice2 = num1.getIntegerValue("Enter a number 1-4: ");

		switch (choice2) {
			case 1:
				addOrganicDog();
				break;
			case 2:
				addOrganicCat();
				break;
			case 3:
				addRoboticDog();
				break;
			case 4:
				addRoboticCat();
				break;
		}

	}

	public void addOrganicDog() {
		Dog pet = new Dog(petName, description, 0, 0, 0, 0, 0, true, true);
		shelterMap.put(petName, pet);

	}

	public void addOrganicCat() {
		Cat pet = new Cat(petName, description, 0, 0, 0, 0, 0, false, true);
		shelterMap.put(petName, pet);

	}

	public void addRoboticDog() {
		Robot pet = new Robot(petName, description, 0, 0, 0, true, true);
		shelterMap.put(petName, pet);

	}

	public void addRoboticCat() {
		Robot pet = new Robot(petName, description, 0, 0, 0, false, true);
		shelterMap.put(petName, pet);

	}

	public void listPet() {

		shelterMap.forEach((petName, pet) -> {

		});

	}

	public void choosePet() {

		shelterMap.forEach((petName, pet) -> {

		});

	}
}

