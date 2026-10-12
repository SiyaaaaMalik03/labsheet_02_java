import java.util.Scanner;

/**
 * Lab Sheet-02 | Q16 (Shift operators): Fast multiplication and division of a number by powers of two.
 *   n << k  = n * 2^k      (left shift)
 *   n >> k  = n / 2^k      (right shift, result rounded towards negative infinity)
 */
public class Q16_ShiftMultiplyDivide {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer         : ");
            int number = sc.nextInt();
            System.out.print("Enter power k (0 to 30)  : ");
            int k = sc.nextInt();

            if (k < 0 || k > 30) {
                System.out.println("Please enter k between 0 and 30.");
                return;
            }

            long multiplied = (long) number << k;     // cast to long so large results do not overflow
            int divided = number >> k;
            long powerOfTwo = 1L << k;                // 2^k computed with a shift

            System.out.println("2^" + k + " = " + powerOfTwo);
            System.out.println(number + " << " + k + " = " + multiplied + "   (same as " + number + " * " + powerOfTwo + ")");
            System.out.println(number + " >> " + k + " = " + divided + "   (same as " + number + " / " + powerOfTwo + " for non-negative numbers)");
            if (number < 0) {
                System.out.println("Note: for negative numbers >> rounds towards negative infinity, while / truncates towards zero ("
                        + number + " / " + powerOfTwo + " = " + (number / powerOfTwo) + ").");
            }
        }
    }
}
