import java.util.Scanner;

/**
 * Lab Sheet-02 | Q20 (do-while loop): Repeatedly accept a password until the correct one is entered.
 * The correct password in this demo is:  Java@123
 * A do-while loop always runs at least once, which suits "ask first, then check".
 */
public class Q20_PasswordDoWhile {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "Java@123";

        try (Scanner sc = new Scanner(System.in)) {
            String input;
            int attempts = 0;

            do {
                System.out.print("Enter password: ");
                if (!sc.hasNextLine()) {
                    System.out.println("\nNo more input. Exiting.");
                    return;
                }
                input = sc.nextLine();
                attempts++;

                if (!input.equals(CORRECT_PASSWORD)) {
                    System.out.println("Wrong password. Try again.");
                }
            } while (!input.equals(CORRECT_PASSWORD));

            System.out.println("Correct password! Access granted after " + attempts + " attempt(s).");
        }
    }
}
