import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String middleName = "";
        // First name: must have at least one character
        do
        {
            System.out.print("\nEnter your first name: ");
            firstName = in.nextLine();
        } while (firstName.length() == 0);
        // Last name: must have at least one character
        do
        {
            System.out.print("\nEnter your last name: ");
            lastName = in.nextLine();
        } while (lastName.length() == 0);
        System.out.println("\nHello, " + firstName + " " + lastName + "!");
        // Middle name: zero-length input is allowed
        System.out.print("\nEnter your middle name (or press Enter to skip): ");
        middleName = in.nextLine();
        if (middleName.length() == 0)
        {
            System.out.println("No middle name entered.");
        }
        else
        {
            System.out.println("Full name: " + firstName + " " + middleName + " " + lastName);
        }
    }
}
