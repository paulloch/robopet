package robopet;

public class App {
	public static void main(String[] args) throws Exception {

		int choice1;
		boolean quit = false;
		Shelter shelter = new Shelter();

		// creates pets for shelter
		shelter.existingPets();

		// Game Loop and main menu
		while (quit == false) {
			System.out.println();
			System.out.println("Welcome to the Pet Shelter\r\n" + //
					"\r\n" + //
					"--Now with Robotic Pets--\r\n" + //
					"\r\n" + //
					"1)  View a list of pets\r\n" + //
					"\r\n" + //
					"2)  Add pet to list\r\n" + //
					"\r\n" + //
					"3)  Choose pet(s) from list\r\n" + //
					"\r\n" + //
					"4)  Quit shelter\r\n" + //
					"");

			KeyboardInput num1 = new KeyboardInput();
			choice1 = num1.getIntegerValue("Enter a number 1-4: ");
			System.out.println();
			// sub menu for lists
			switch (choice1) {
				case 1:
					System.out.println("1) List all types of pets\r\n" + //
							"\r\n" + //
							"2) List only Organic Dogs\r\n" + //
							"\r\n" + //
							"3) List only Organic Cats\r\n" + //
							"\r\n" + //
							"4) List only Robotic Dogs\r\n" + //
							"\r\n" + //
							"5) List only Robotic Cats");
					System.out.println();
					System.out.println();
					KeyboardInput num2 = new KeyboardInput();
					choice1 = num2.getIntegerValue("Enter a number 1-5: ");
					System.out.println();
					switch (choice1) {
						case 1:
							shelter.listPet();
							break;
						case 2:
							shelter.listOrganicDog();
							break;
						case 3:
							shelter.listOrganicCat();
							break;
						case 4:
							shelter.listRoboticDog();
							break;
						case 5:
							shelter.listRoboticCat();
							break;
					}
					break;
				case 2:
					shelter.addPet();
					break;
				case 3:
					shelter.choosePet();
					break;
				case 4:
					quit = true;
					;
			}

		}

		System.out.println();
		System.out.println("Thank You for your service.");
		System.out.println();

	}

}
