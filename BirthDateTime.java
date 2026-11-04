
import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year, month, day, hours, minutes;
        int maxDays;

        // Input year
        year = getRangedInt(in, "Enter birth year", 1950, 2015);

        // Input month
        month = getRangedInt(in, "Enter birth month", 1, 12);

        // Determine maximum days based on month
        switch(month)
        {
            case 2:
                maxDays = 29;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            default:
                maxDays = 31;
                break;
        }

        // Input day
        day = getRangedInt(in, "Enter birth day", 1, maxDays);

        // Input hours and minutes
        hours = getRangedInt(in, "Enter birth hour", 1, 24);
        minutes = getRangedInt(in, "Enter birth minutes", 1, 59);

        // Display birth date and time
        System.out.println("\nBirth Date and Time:");
        System.out.println(month + "/" + day + "/" + year);
        System.out.println(hours + ":" + minutes);

        in.close();
    }

    // Gets an integer within a specified range
    public static int getRangedInt(Scanner pipe, String prompt,
                                   int low, int high)
    {
        int value;

        do
        {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");

            while(!pipe.hasNextInt())
            {
                System.out.println("Invalid input. Enter a whole number.");
                pipe.next();
            }

            value = pipe.nextInt();

            if(value < low || value > high)
            {
                System.out.println("Number must be between "
                        + low + " and " + high);
            }

        } while(value < low || value > high);

        return value;
    }
}
