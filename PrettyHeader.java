public class PrettyHeader {
    public static void main(String[] args)
    {
        SafeInput.prettyHeader("Message Centered Here");
    }
}

class SafeInput
{
    /**
     * Displays a 3-line header exactly 60 characters wide.
     * Line 1 and 3: all stars.
     * Line 2: three stars, the message centered, three stars.
     *
     * @param msg the message to center in the header
     */
    public static void prettyHeader(String msg)
    {
        final int WIDTH = 60;
        final int EDGE = 3;                      // stars on each end of the middle row

        int innerWidth = WIDTH - (2 * EDGE);     // space available for the message
        int totalPad = Math.max(0, innerWidth - msg.length());
        int leftPad = totalPad / 2;
        int rightPad = totalPad - leftPad;       // takes the extra space if odd

        // Top row
        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        // Middle row
        for (int i = 0; i < EDGE; i++)
        {
            System.out.print("*");
        }
        for (int i = 0; i < leftPad; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightPad; i++)
        {
            System.out.print(" ");
        }
        for (int i = 0; i < EDGE; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        // Bottom row
        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
