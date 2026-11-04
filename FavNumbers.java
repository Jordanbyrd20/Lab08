import java.util.Scanner;
public class FavNumbers {
    // Unconstrained getInt: accepts any integer, re-prompts on non-numeric input.
    public static int getInt(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = in.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }
    // Unconstrained getDouble: accepts any double, re-prompts on non-numeric input.
    public static double getDouble(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = in.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = getInt(in, "Enter your favorite integer: ");
        double favDouble = getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite integer is " + favInt);
        System.out.println("Your favorite double is " + favDouble);
        in.close();
    }
}

