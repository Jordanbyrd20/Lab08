import java.util.Scanner;
public class CheckOut {   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double total = 0.0;
        boolean more;
        System.out.println("Welcome to the $10 Store! Nothing costs more than $10.00.");
        do {
            double price = getRangedDouble("Enter the price of your item ($0.50 - $10.00): ", 0.50, 10.00);
            total += price;
            more = getYNConfirm("Do you have more items? (y/n): ");
        } while (more);
        System.out.printf("Your total cost is: $%.2f%n", total);
    }
    /**
     * Prompts until the user enters a valid double between min and max (inclusive).
     */
    public static double getRangedDouble(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                input.nextLine(); // clear the rest of the line
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.printf("Price must be between $%.2f and $%.2f. Try again.%n", min, max);
            } else {
                System.out.println("That is not a valid number. Try again.");
                input.nextLine(); // discard bad input
            }
        }
    }
    /**
     * Prompts until the user enters y/yes or n/no. Returns true for yes.
     */
    public static boolean getYNConfirm(String prompt) {
        while (true) {
            System.out.print(prompt);
            String answer = input.nextLine().trim().toLowerCase();
            if (answer.equals("y") || answer.equals("yes")) {
                return true;
            }
            if (answer.equals("n") || answer.equals("no")) {
                return false;
            }
            System.out.println("Please enter y or n.");
        }
    }
}

