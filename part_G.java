import java.util.Scanner;
public class part_G {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Example: a US-style ZIP code (5 digits)
        String zip = getRegExString(in, "Enter a 5-digit ZIP code", "\\d{5}");
        System.out.println("You entered: " + zip);

        // Example: a simple SSN-style pattern
        String ssn = getRegExString(in, "Enter a SSN (###-##-####)", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You entered: " + ssn);

        in.close();
    }

    /**
     * Prompts the user until they enter a String that matches the given RegEx pattern.
     *
     * @param pipe   Scanner object created in main (e.g. new Scanner(System.in))
     * @param prompt message displayed as the prompt for the input
     * @param regEx  RegEx pattern in Java String format used for matching
     * @return a String that fully matches the RegEx pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

            if (retString.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Invalid input: \"" + retString + "\" does not match the required pattern. Please try again.");
            }
        } while (!done);

        return retString;
    }
}
