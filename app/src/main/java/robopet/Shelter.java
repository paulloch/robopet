
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

	public void existingPets() {
		Dog dog1 = new Dog("", "", 18, 22, 17, 15, 24, 20, true, true);
		dog1.setName("Snoopy");
		dog1.setDescription("White Beagle");
		dog1.setDays(20);
		shelterMap.put("Snoopy", dog1);
		Cat cat1 = new Cat("", "", 13, 14, 16, 22, 12, 13, false, true);
		cat1.setName("Garfield");
		cat1.setDescription("Orange Tabby");
		cat1.setDays(13);
		shelterMap.put("Garfield", cat1);
		Dog dog2 = new Dog("", "", 18, 22, 17, 15, 24, 20, true, true);
		dog2.setName("Scooby");
		dog2.setDescription("White Beagle");
		dog2.setDays(20);
		shelterMap.put("Snoopy", dog1);
		Cat cat2 = new Cat("", "", 13, 14, 16, 22, 12, 13, false, true);
		cat2.setName("Tom");
		cat2.setDescription("Alley Cat");
		cat2.setDays(13);
		shelterMap.put("Tom", cat1);
	}

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
		System.out.println("Enter Pet Name (identical name will not save)");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet Description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Dog pet = new Dog(petName, description, 10, 10, 0, 0, 0, 1, true, true);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();

	}

	public void addOrganicCat() {
		System.out.println("Enter Pet Name (identical name will not save)");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Cat pet = new Cat(petName, description, 10, 10, 0, 0, 0, 1, false, true);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();
	}

	public void addRoboticDog() {
		System.out.println("Enter Pet Name (identical name will not save)");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Robot pet = new Robot(petName, description, 75, 100, 1, true, false);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();
	}

	public void addRoboticCat() {
		System.out.println("Enter Pet Name (identical name will not save)");
		KeyboardInput name = new KeyboardInput();
		petName = name.getStringValue("");
		System.out.println();
		System.out.println("Enter Pet description");
		KeyboardInput newDescription = new KeyboardInput();
		description = newDescription.getStringValue("");
		System.out.println("");
		Robot pet = new Robot(petName, description, 75, 100, 1, false, false);
		pet.setName(petName);
		pet.setDescription(description);
		pet.setDays(1);
		shelterMap.put(petName, pet);
		System.out.println();

	}



	public void listOrgCat() {
		for (Map.Entry<String, Pet> entry : shelterMap.entrySet()) {
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine() == true) {
				System.out.print("Organic Dog  - ");
			} 
			if (entry.getValue().isAlive() == true && entry.getValue().isCanine() == false) {
				System.out.print("Organic Cat  - ");
			} 
		 	if (entry.getValue().isAlive() == false && entry.getValue().isCanine() == true) {
				System.out.print("Robotic Dog  - ");
			}
			if (entry.getValue().isAlive() == false && entry.getValue().isCanine() == false) {
				System.out.print("Robotic Cat  - ");
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
					choice2 = num1.getIntegerValue("1) Charge Pet  2) Change Oil  3) Skip a day");

					switch (choice2) {
						case 1:
							entry.getValue().feed();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Charging Pet");
							entry.getValue().infoPet();

							break;
						case 2:
							entry.getValue().water();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Changing Oil");
							entry.getValue().infoPet();
							break;
						case 3:
							entry.getValue().tick();
							break;

					}
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
				}

				if (entry.getValue().isCanine() == false && entry.getValue().isAlive() == true) {
					KeyboardInput num1 = new KeyboardInput();

					choice2 = num1
							.getIntegerValue(
									"1) Feed  2) Water  3) Clean  4) Play  5) Clean Litter  6) Skip a day");

					switch (choice2) {
						case 1:
							entry.getValue().feed();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Feeding Cat");
							entry.getValue().infoPet();
							break;
						case 2:
							entry.getValue().water();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Watering Cat");
							entry.getValue().infoPet();
							break;
						case 3:
							entry.getValue().clean();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Cleaning Cat");
							entry.getValue().infoPet();
							break;
						case 4:
							entry.getValue().play();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Playing with Cat");
							entry.getValue().infoPet();
							break;
						case 5:
							entry.getValue().cleanLitter();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Changing Litter");
							entry.getValue().infoPet();
							break;
						case 6:
							System.out.println();
							entry.getValue().tick();
							break;

					}
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
				}

				if (entry.getValue().isCanine() == true && entry.getValue().isAlive() == true) {
					KeyboardInput num1 = new KeyboardInput();
					choice2 = num1
							.getIntegerValue("1) Feed  2) Water  3) Clean  4) Play  5) Clean Cage  6)Skip a day");

					switch (choice2) {
						case 1:
							entry.getValue().feed();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Feeding Dog");
							entry.getValue().infoPet();
							break;
						case 2:
							entry.getValue().water();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Watering Dog");
							entry.getValue().infoPet();
							break;
						case 3:
							entry.getValue().clean();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Cleaning Dog");
							entry.getValue().infoPet();
							break;
						case 4:
							entry.getValue().play();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Playing with Dog");
							entry.getValue().infoPet();
							break;
						case 5:
							entry.getValue().cleanCage();
							entry.getValue().tick();
							System.out.println();
							System.out.println("After Cleaning Cage");
							entry.getValue().infoPet();
							break;
						case 6:
							System.out.println();
							entry.getValue().tick();
							break;

					}
					Console console = System.console();
					System.out.println("Press ENTER key to continue...");
					console.readLine();
				}
			}

		}

	}

	public void removePet() {

		Iterator<Map.Entry<String, Pet>> iterator = shelterMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Pet> entry = iterator.next();
			String key = entry.getKey();
			System.out.println();
			System.out.println(key + " " + entry.getValue().getDescription());
			if (entry.getValue().getDays()==0 && entry.getValue().isAlive()==true){System.out.println("is dead.");}
			if (entry.getValue().getDays()==0 && entry.getValue().isAlive()==false){System.out.println("is non-functioning.");}
			KeyboardInput num1 = new KeyboardInput();
			System.out.println();
			choice2 = num1.getIntegerValue("\r\n" + //
					"1) Remove Pet from List   2) Skip");
			System.out.println();

			switch (choice2) {
				case 1:
				if (entry.getValue().getDays() == 0 && entry.getValue().isAlive()==false) {
						System.out.println(key + " has been sent to the junkyard");
						System.out.println();}
					if (entry.getValue().getDays() == 0 && entry.getValue().isAlive()==true) {
						System.out.println(key + " has been sent to the pet cemetary");
						System.out.println();
					}
					if (entry.getValue().getDays() > 0) {
						System.out.println(key + " has been adopted after " + entry.getValue().getDays() + " days");
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
