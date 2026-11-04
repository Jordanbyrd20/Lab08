static final String SSN_PATTERN  = "^\\d{3}-\\d{2}-\\d{4}$";
static final String MNUM_PATTERN = "^(M|m)\\d{5}$";
static final String MENU_PATTERN = "^[OoSsVvQq]$";

/**
 * Prompts until the user enters a string that matches the regex.
 * Returns the valid string, or null if input ends (EOF) first.
 */
public static String getRegExString(Scanner in, String prompt, String regex, String errorMsg) {
    Pattern p = Pattern.compile(regex);
    while (true) {
        System.out.print(prompt);
        if (!in.hasNextLine()) {
            System.out.println();
            return null;               // no more input
        }
        String line = in.nextLine();
        System.out.println("  You entered: \"" + line + "\"");
        if (p.matcher(line).matches()) {
            System.out.println("  MATCH");
            return line;
        }
        System.out.println("  FAIL - " + errorMsg);
    }
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String ssn = getRegExString(in,
            "Enter SSN (###-##-####): ",
            SSN_PATTERN,
            "SSN must look like 123-45-6789");
    if (ssn == null) return;

    String mNum = getRegExString(in,
            "Enter UC student M number (M#####): ",
            MNUM_PATTERN,
            "M number must be M or m followed by exactly 5 digits");
    if (mNum == null) return;

    String choice = getRegExString(in,
            "Menu: (O)pen  (S)ave  (V)iew  (Q)uit - choose: ",
            MENU_PATTERN,
            "choose one letter: O, S, V, or Q");
    if (choice == null) return;

    System.out.println();
    System.out.println("SSN:    " + ssn);
    System.out.println("M #:    " + mNum);
    switch (Character.toUpperCase(choice.charAt(0))) {
        case 'O': System.out.println("Menu:   Open");  break;
        case 'S': System.out.println("Menu:   Save");  break;
        case 'V': System.out.println("Menu:   View");  break;
        case 'Q': System.out.println("Menu:   Quit");  break;
    }
}
public class Reggie {
    static final String SSN_PATTERN  = "^\\d{3}-\\d{2}-\\d{4}$";
    static final String MNUM_PATTERN = "^(M|m)\\d{5}$";
    static final String MENU_PATTERN = "^[OoSsVvQq]$";

    /**
     * Prompts until the user enters a string that matches the regex.
     * Returns the valid string, or null if input ends (EOF) first.
     */
    public static String getRegExString(Scanner in, String prompt, String regex, String errorMsg) {
        Pattern p = Pattern.compile(regex);
        while (true) {
            System.out.print(prompt);
            if (!in.hasNextLine()) {
                System.out.println();
                return null;               // no more input
            }
            String line = in.nextLine();
            System.out.println("  You entered: \"" + line + "\"");
            if (p.matcher(line).matches()) {
                System.out.println("  MATCH");
                return line;
            }
            System.out.println("  FAIL - " + errorMsg);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = getRegExString(in,
                "Enter SSN (###-##-####): ",
                SSN_PATTERN,
                "SSN must look like 123-45-6789");
        if (ssn == null) return;

        String mNum = getRegExString(in,
                "Enter UC student M number (M#####): ",
                MNUM_PATTERN,
                "M number must be M or m followed by exactly 5 digits");
        if (mNum == null) return;

        String choice = getRegExString(in,
                "Menu: (O)pen  (S)ave  (V)iew  (Q)uit - choose: ",
                MENU_PATTERN,
                "choose one letter: O, S, V, or Q");
        if (choice == null) return;

        System.out.println();
        System.out.println("SSN:    " + ssn);
        System.out.println("M #:    " + mNum);
        switch (Character.toUpperCase(choice.charAt(0))) {
            case 'O': System.out.println("Menu:   Open");  break;
            case 'S': System.out.println("Menu:   Save");  break;
            case 'V': System.out.println("Menu:   View");  break;
            case 'Q': System.out.println("Menu:   Quit");  break;
        }
    }
}
