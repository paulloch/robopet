package virtual.pets;

import java.util.Scanner;

public class NumberInput {
    private Scanner input = new Scanner(System.in);

    /////////////////////////////
    public int validateNumber(String prompt) {
        int value = 0;
        boolean exitMethod = false;
        do {
            System.out.print(prompt + ": ");
            try {
                String checkValue = input.nextLine();
                value = Integer.parseInt(checkValue);
                exitMethod = true;
            } catch (NumberFormatException ne) {
                System.out.println("Correction Required: Numbers Only");
            }
        } while (!exitMethod);
        return value;

    }

    public int getValidatedFeed(String prompt) {
        boolean exitMethod = false;
        int number;
        do {
            number = validateNumber(prompt);
            if (number > 0 && number < 3) {
                exitMethod = true;
            } else {
                System.out.print("Number 1 - 2 only");
            }

        } while (!exitMethod);

        return number;

    }
}
