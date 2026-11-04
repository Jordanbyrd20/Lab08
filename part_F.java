import java.util.Scanner;
public class part_F {
    /**
     * Prompts the user for a Yes/No confirmation and loops until a valid
     * response (y, Y, n, N) is entered.
     *
     * @param pipe   the Scanner created in main (e.g. console input)
     * @param prompt the message to display as the prompt
     * @return true for yes (y/Y), false for no (n/N)
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        boolean done = false;
        boolean result = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            input = pipe.nextLine().trim();

            if (input.equalsIgnoreCase("Y")) {
                result = true;
                done = true;
            } else if (input.equalsIgnoreCase("N")) {
                result = false;
                done = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!done);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean answer = getYNConfirm(in, "Do you want to continue?");
        System.out.println("You answered: " + answer);

        in.close();

    }
}
