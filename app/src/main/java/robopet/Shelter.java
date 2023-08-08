package robopet;

// still need to choosePet and erasePet

import java.io.Console;
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

		System.out.println("");

		System.out.println("1)  Add Organic Dog\r\n" + //
				"\r\n" + //
				"2)  Add Organic Cat\r\n" + //
				"\r\n" + //
				"3)  Add Robotic Dog\r\n" + //
				"\r\n" + //
				"4)  Add Robotic Cat\r\n" + //
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
		System.out.println("Enter Pet Name");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Dog pet = new Dog(petName, description, 0, 0, 0, 0, 0, true, true);
		shelterMap.put(petName, pet);
		

	}

	public void addOrganicCat() {
		System.out.println("Enter Pet Name");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Cat pet = new Cat(petName, description, 0, 0, 0, 0, 0, false, true);
		shelterMap.put(petName, pet);
	}

	public void addRoboticDog() {
		System.out.println("Enter Pet Name");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Robot pet = new Robot(petName, description, 0, 0, 0, true, true);
		
		shelterMap.put(petName, pet);
	}

	public void addRoboticCat() {
		System.out.println("Enter Pet Name");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Robot pet = new Robot(petName, description, 0, 0, 0, false, true);
		shelterMap.put(petName, pet);
		System.out.println(pet.getDescription()+ pet.getDays());


	}

	public void listPet() {
		for (Map.Entry<String,Pet> entry : shelterMap.entrySet()) {
			System.out.println();
			System.out.println(entry.getKey());
			Console console = System.console();
			System.out.println("Press ENTER key to continue...");
			console.readLine();
		}
	}

	public void choosePet() {

		KeyboardInput num1 = new KeyboardInput();
		choice2 = num1.getIntegerValue("\r\n" + //
				"1) Care for Pets   2) Remove Pets from List   3) Skip");

		switch (choice2) {
			case 1:
				carePet();
				break;

			case 2:
				removePet();
				break;

			case 3:
				break;

		}
	}

	public void carePet() {

// still not working
		for (String petName : shelterMap.keySet()) {
			System.out.println();
			shelterMap.get(petName).infoPet();
			System.out.println();
			shelterMap.get(petName).carePet();
		}

	}

	public void removePet() {

// still not working
		for (String petName : shelterMap.keySet()) {
			System.out.println();
			shelterMap.get(petName).infoPet();
			KeyboardInput num1 = new KeyboardInput();
			choice2 = num1.getIntegerValue("\r\n" + //
					"1) Remove Pet from List   2) Skip");
			switch (choice2) {
				case 1:
					shelterMap.remove(petName);
					break;
				case 2:
					break;

			}

		}

	}
}
