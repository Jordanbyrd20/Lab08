import java.util.Scanner;
public class Part_B {
    public static int getInt(Scanner pipe, String prompt)
    {
        int value = 0;
        boolean done = false;
        String trash;
        do
        {
            System.out.print(prompt);
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                // Clear the pipe: consume the leftover newline (and anything else on the line)
                if (pipe.hasNextLine())
                {
                    pipe.nextLine();
                }
                done = true;
            }
            else
            {
                // Read the trash so the bad input doesn't cause an infinite loop
                trash = pipe.nextLine();
                System.out.println("\"" + trash + "\" is not a valid integer. Please try again.");
            }
        } while (!done);

        return value;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = getInt(in, "Enter any integer: ");
        System.out.println("You entered: " + number);
        in.close();
    }
}
