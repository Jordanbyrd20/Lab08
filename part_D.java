import java.util.Scanner;
public class part_D {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int value = getRangedInt(in, "Enter an integer", 1, 100);
        System.out.println("You entered: " + value);
        in.close();
    }
    /**
     * Prompts the user for an integer within an inclusive range.
     * The input is bulletproofed: non-integer input is read and discarded
     * (the trash), and the trailing newline is cleared after a valid value.
     *
     * @param pipe   Scanner connected to the console (created in main)
     * @param prompt message to display (the [low - high] is appended here)
     * @param low    lowest valid value (inclusive)
     * @param high   highest valid value (inclusive)
     * @return an int between low and high, inclusive
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // clear the pipe: the newline fix
                if (value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Invalid input: " + value + " is not in the range [" + low + " - " + high + "].");
                }
            }
            else
            {
                trash = pipe.nextLine(); // read the trash
                System.out.println("Invalid input: \"" + trash + "\" is not an integer.");
            }
        } while (!done);
        return value;
    }
}
