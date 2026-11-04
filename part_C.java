import java.util.Scanner;
public class part_C {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double value = getDouble(in, "Enter any double value: ");
        System.out.println("You entered: " + value);
        in.close();
    }
    /**
     * Prompts the user until a valid double is entered.
     *
     * @param pipe   Scanner created in main (e.g. new Scanner(System.in))
     * @param prompt message displayed as the prompt
     * @return the valid double entered by the user
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double value = 0;
        boolean done = false;
        do
        {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();            // clear the pipe (the newline fix)
                done = true;
            }
            else
            {
                String trash = pipe.nextLine();   // read the trash
                System.out.println("\"" + trash + "\" is not a valid double. Please try again.");
            }
        } while (!done);
        return value;
    }
}
