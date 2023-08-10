package robopet;

import java.io.Console;
import java.util.HashMap;
import java.util.Iterator;
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
		Dog pet = new Dog(petName, description, 0, 0, 0, 0, 0, 1, true, true);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println(pet.getName() + " " + pet.getDescription() + pet.isCanine() + pet.isAlive());

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
		Cat pet = new Cat(petName, description, 0, 0, 0, 0, 0, 1, false, true);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println(pet.getName() + " " + pet.getDescription() + pet.isCanine() + pet.isAlive());
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
		Robot pet = new Robot(petName, description, 100, 100, 1, true, false);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println(pet.getName() + " " + pet.getDescription());
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
		Robot pet = new Robot(petName, description, 100, 100, 1, false, false);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println(pet.getName() + " " + pet.getDescription());

	}

	public void listPet() {
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine()==true){
				System.out.print("Organic Dog  ");
			}
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine()==false){
				System.out.print("Organic Cat  ");	
				}
			if (entry.getValue().isAlive() == false && entry.getValue().isCanine()==true){
				System.out.print(("Robotic Dog  "));
			}
			if (entry.getValue().isAlive() == false && entry.getValue().isCanine()==false){
				System.out.print("Robotic Cat  ");

			}

	 
	
	
			System.out.println(entry.getKey() + "   " + entry.getValue().getDescription());
			entry.getValue().infoPet();
			Console console = System.console();
			System.out.println("Press ENTER key to continue...");
			console.readLine();
		}
	}

	public void choosePet() {

		KeyboardInput num1 = new KeyboardInput();
		System.out.println();
		choice2 = num1.getIntegerValue("\r\n" + //
				"1) Care for Pets   2) Remove Pet from List   3) Skip");

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
		{
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			System.out.println();
			System.out.println(entry.getKey() + " " + entry.getValue().getDescription());
			entry.getValue().infoPet();
			if (entry.getValue().isAlive() == false) {
				KeyboardInput num1 = new KeyboardInput();
				choice2 = num1.getIntegerValue("1) Charge  2) Oil  3) Skip a day");

				switch (choice2) {
					case 1:
						entry.getValue().feed();
						entry.getValue().tick();
						System.out.println("After charging pet");
						entry.getValue().infoPet();
						break;
					case 2:
						entry.getValue().water();
						entry.getValue().tick();
						System.out.println("After changing oil");
						entry.getValue().infoPet();
						break;
					case 3:
						entry.getValue().tick();
						break;

				}
			}

			if (entry.getValue().isCanine() == false && entry.getValue().isAlive() == true) {
				KeyboardInput num1 = new KeyboardInput();

				choice2 = num1
						.getIntegerValue("1) Feed   2) Water   3) Clean   4) Play   5) Clean Litter  6) Skip a day");

				switch (choice2) {
					case 1:
						entry.getValue().feed();
						entry.getValue().tick();
						System.out.println("After feeding cat");
						entry.getValue().infoPet();
						break;
					case 2:
						entry.getValue().water();
						entry.getValue().tick();
						System.out.println("After watering cat");
						entry.getValue().infoPet();
						break;
					case 3:
						entry.getValue().clean();
						entry.getValue().tick();
						System.out.println("After cleaning cat");
						entry.getValue().infoPet();
						break;
					case 4:
						entry.getValue().play();
						entry.getValue().tick();
						System.out.println("After playing with cat");
						entry.getValue().infoPet();
						break;
					case 5:
						entry.getValue().cleanLitter();
						entry.getValue().tick();
						System.out.println("After changing litter");
						entry.getValue().infoPet();
						break;
					case 6:
						entry.getValue().tick();
						break;

				}

			}

			if (entry.getValue().isCanine() == true && entry.getValue().isAlive() == true) {
				KeyboardInput num1 = new KeyboardInput();
				choice2 = num1.getIntegerValue("1) Feed   2) Water  3) Clean  4) Play  5) Clean Cage  6)Skip a day");

				switch (choice2) {
					case 1:
						entry.getValue().feed();
						entry.getValue().tick();
						System.out.println("After feeding dog");
						entry.getValue().infoPet();
						break;
					case 2:
						entry.getValue().water();
						entry.getValue().tick();
						System.out.println("After watering dog");
						entry.getValue().infoPet();
						break;
					case 3:
						entry.getValue().clean();
						entry.getValue().tick();
						System.out.println("After cleaning dog");
						entry.getValue().infoPet();
						break;
					case 4:
						entry.getValue().play();
						entry.getValue().tick();
						System.out.println("After playing with dog");
						entry.getValue().infoPet();
						break;
					case 5:
						entry.getValue().cleanCage();
						entry.getValue().tick();
						System.out.println("After cleaning cage");
						entry.getValue().infoPet();
						break;
					case 6:
						entry.getValue().tick();
						break;

				}
			}
		}

	}
			Console console = System.console();
			System.out.println("Press ENTER key to continue...");
			console.readLine();
}

	public void removePet() {

		Iterator<Map.Entry<String, Pet>> iterator = shelterMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Pet> entry = iterator.next();
			String key = entry.getKey();
			System.out.println(key + " " + entry.getValue().getDescription());
			KeyboardInput num1 = new KeyboardInput();
			System.out.println();
			choice2 = num1.getIntegerValue("\r\n" + //
					"1) Remove Pet from List   2) Skip");
					System.out.println();

			switch (choice2) {
				case 1:

					if (entry.getValue().getDays() == 0) {
						System.out.println(key + " has been sent to the pet cemetary");
						System.out.println();
					}
					if (entry.getValue().getDays() > 0) {
						System.out.println(key + " has been adopted after " + entry.getValue().getDays() +" days");
						System.out.println();
					}
					shelterMap.remove(key);
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
					return;
				case 2:
					break;

			}

		}
		;

	}
}
