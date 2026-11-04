import java.util.Scanner;
public class part_E {
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value = 0;
        boolean done = false;
        String trash = "";
        // Build the full prompt with the range appended
        String fullPrompt = prompt + " [" + low + " - " + high + "]: ";
        do
        {
            System.out.print(fullPrompt);
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine(); // clear the input buffer
                if (value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nError: " + value + " is out of range. Please enter a value between "
                            + low + " and " + high + ".");
                }
            }
            else
            {
                trash = pipe.nextLine(); // clear the invalid input
                System.out.println("\nError: \"" + trash + "\" is not a valid number. Please try again.");
            }
        } while (!done);
        return value;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double result = getRangedDouble(in, "Enter a decimal value", 1.5, 9.5);
        System.out.println("You entered: " + result);
        in.close();
    }
}
