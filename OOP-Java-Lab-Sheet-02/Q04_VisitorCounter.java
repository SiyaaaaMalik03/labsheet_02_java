import java.util.Scanner;

/**
 * Lab Sheet-02 | Q4 (Unary operators): Prefix and postfix increment/decrement
 * by simulating a counter for visitors entering and leaving a store.
 *
 *   count++  (postfix): the CURRENT value is used first, then the variable is changed.
 *   ++count  (prefix) : the variable is changed first, then the NEW value is used.
 */
public class Q04_VisitorCounter {
    public static void main(String[] args) {
        // ---------- Part 1: fixed demonstration of prefix and postfix ----------
        int visitors = 0;
        System.out.println("--- Prefix vs Postfix demonstration (store starts empty: visitors = 0) ---");
        System.out.println("A visitor enters  (visitors++) : value used = " + visitors++ + ", visitors now = " + visitors);
        System.out.println("A visitor enters  (++visitors) : value used = " + ++visitors + ", visitors now = " + visitors);
        System.out.println("A visitor leaves  (visitors--) : value used = " + visitors-- + ", visitors now = " + visitors);
        System.out.println("A visitor leaves  (--visitors) : value used = " + --visitors + ", visitors now = " + visitors);

        // ---------- Part 2: interactive store counter ----------
        int inside = 0;           // visitors currently inside
        int totalEntered = 0;     // total visitors who entered today
        System.out.println();
        System.out.println("--- Store counter simulation ---");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("1 = Visitor enters, 2 = Visitor leaves, 3 = Exit : ");
                if (!sc.hasNextInt()) {
                    break;
                }
                int choice = sc.nextInt();
                if (choice == 1) {
                    ++inside;                 // prefix increment
                    totalEntered++;           // postfix increment
                    System.out.println("A visitor entered. Inside now: " + inside);
                } else if (choice == 2) {
                    if (inside > 0) {
                        inside--;             // postfix decrement
                        System.out.println("A visitor left. Inside now: " + inside);
                    } else {
                        System.out.println("The store is already empty.");
                    }
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        }
        System.out.println("Total visitors who entered today : " + totalEntered);
        System.out.println("Visitors still inside            : " + inside);
    }
}
