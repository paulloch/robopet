package robopet;

import java.util.Scanner;

public class KeyboardInput {

    /* this will handle keyboard input */

    /* This is a class scope field */
    private Scanner input = new Scanner(System.in);

    /*
     * This gets the keyboard string value
     */

    public String getStringValue(String prompt) {
        // This is the value that will be returned
        String value;

        // Display the prompt for the user
        System.out.print(prompt + ": ");
        // Gets the string from the keyboard
        value = input.nextLine();
        // return the string
        return value;
    }

    /*
     * Get an integer from the user
     */
    public int getIntegerValue(String prompt) {
        // This will be the value to return
        int value = 0;
        // This is the Exit flag
        boolean exitMethod = false;
        // Do while loop
        do {
            // display the prompt for the user
            System.out.print(prompt + ": ");

            // try m
            try {
                // get a string value from the user
                String checkValue = input.nextLine();
                // Try to convert user input to an integer
                value = Integer.parseInt(checkValue);
                // if Successful set exit flag to true
                exitMethod = true;
                // catch all number conversion exceptions
            } catch (NumberFormatException ne) {
                // reply with response for wrong answer
                System.out.println("You did not enter a correct number");
            }
            // we check exit flag to see if it is true
        } while (!exitMethod);
        // return the integer
        return value;
    }

}
