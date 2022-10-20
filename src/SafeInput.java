import java.util.Scanner;

import java.util.Scanner;
public class SafeInput {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = low - 1;
        boolean done = false;


        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) ;
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println("You said your val is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said said your val is " + retVal + " but that is out of range");
                }
            }
        } while (!done);

        return retVal;

    }

    /**
     * Use scanner to get a double from the console with no contstraints
     *
     * @param pipe   scanner to use for console input
     * @param prompt string prompt to tell the user what to input
     * @return a double value
     */
    public static double getdouble(Scanner pipe, String prompt) {

        boolean done = false;
        double retVal = 0;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                System.out.println("You said said your val is " + retVal + " but that is out of range");
            }
        } while (!done);

        return retVal;

    }

    /**
     * Get an arbitrary string of at least 1 character in length
     *
     * @param pipe   scanner to use for input
     * @param Prompt message for user on what to input
     * @return a string entered by the user by at least 1 character
     */
    public static String getNonZeroLength(Scanner pipe, String Prompt) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(Prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() > 0) {
                done = true;
            } else {
                System.out.println("You must enter at least one character");
            }
        } while (!done);
        return retVal;
    }
}
