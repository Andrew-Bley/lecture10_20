import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // double salary = getdouble(in, "Enter your salary");
        // sayhello(); // Prints hello 1 time
        // System.out.println("\n spacer \n");
        //sayhello(10);
        //sayMsg("Life sucks", 35);

        // int myFav = getRangedInt(console, "enter your val", 1, 100);
        //int myFavDoubled = doubleit(myFav);
        //System.out.println("Doubled is " +myFavDoubled);
        String msg = getNonZeroLength(in, "Enter any string other than zero");
        System.out.println("Msg is " + msg);
        String ssn = SafeInput.getRegExString

    }

    //user defined methods go here and are static
    public static void sayhello() {
        System.out.println("Hello");
    }

    public static void sayhello(int times) {
        for (int rep = 0; rep < times; rep++)
            System.out.println("Hello");
    }

    public static void sayMsg(String msg, int times) {
        for (int rep = 0; rep < times; rep++)
            System.out.println(msg);
    }

    public static int doubleit(int toBeDoubled) {
        int doubledVal = toBeDoubled * 2;
        return doubledVal;
    }

    /**
     * Get an in integer within a specified range of low-high
     *
     * @param pipe   scanner to use for console input
     * @param prompt string that tells the user what to input
     * @param low    low value for a range low-high
     * @param high   high value for a range low-high
     * @return on int within the low-high range
     */

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

    public static int getInt(Scanner pipe, String prompt) {

        boolean done = false;
        int retVal = 0;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
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
    public static int getdouble(Scanner pipe, String prompt) {

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

    public static int getrangeddouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;


        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                if (retVal >= low && retVal <= high) {
                    done = true;
                }
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

    public static String getRegExString (Scanner pipe, String Prompt, String Pattern) {
        String retVal = "";
        boolean done = false;
        String rspYN = "";

    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retval = false;
        String rspYN = "";
        boolean done = false;
        do {
            System.out.println(prompt + ": ");
            rspYN = pipe.nextLine();

            if (rspYN.equalsIgnoreCase("Y"))
            {
                retval = true;
                done = true;
            }
            else if (rspYN.equalsIgnoreCase("N"))
            {
                retval = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter [Y/N]");
            }
        }while(!done);
        return retval;
    }

}
