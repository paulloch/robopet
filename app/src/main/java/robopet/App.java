package robopet;

public class App {
	public static void main(String[] 
	args) throws Exception {

		int choice1;
		boolean quit = false;
		Shelter shelter = new Shelter();
		shelter.existingPets();

		while (quit == false) {
			System.out.println();
			System.out.println("Welcome to the Pet Shelter\r\n" + //
					"\r\n" + //
					"--Now with Robotic Pets--\r\n" + //
					"\r\n" + //
					"1)  View list of pets\r\n" + //
					"\r\n" + //
					"2)  Add pets to list\r\n" + //
					"\r\n" + //
					"3)  Choose pet(s) from list\r\n" + //
					"\r\n" + //
					"4)  Quit shelter\r\n" + //
					"");

			KeyboardInput num1 = new KeyboardInput();
			choice1 = num1.getIntegerValue("Enter a number 1-4: ");
			System.out.println();

			switch (choice1) {
				case 1:
					shelter.listPet();
					break;
				case 2:
					shelter.addPet();
					break;
				case 3:
					 shelter.choosePet();
					break;
				case 4:
					quit = true;
					break;
			}

		}

		System.out.println();
		System.out.println("Thank You for your service.");
		System.out.println();

	}
}
