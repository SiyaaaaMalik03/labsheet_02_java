import java.util.Scanner;

/**
 * Lab Sheet-02 | Q5 (Unary operators): Take an integer and output its negative value using unary operators.
 * Unary minus (-) changes the sign of its operand; unary plus (+) keeps the sign.
 */
public class Q05_NegativeValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            int negative = -number;      // unary minus
            int unchanged = +number;     // unary plus

            System.out.println("Original value        : " + number);
            System.out.println("Unary minus  (-n)     : " + negative);
            System.out.println("Unary plus   (+n)     : " + unchanged);
        }
    }
}
