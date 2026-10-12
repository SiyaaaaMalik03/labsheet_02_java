import java.util.Scanner;

/**
 * Lab Sheet-02 | Q22 (while loop): Reverse the digits of an integer using a while loop.
 * Trailing zeros of the original number disappear in the reverse (1200 -> 21), as in normal arithmetic.
 */
public class Q22_ReverseDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            boolean negative = number < 0;
            long temp = Math.abs((long) number);      // long avoids overflow for Integer.MIN_VALUE
            long reversed = 0;

            while (temp > 0) {
                long digit = temp % 10;               // last digit
                reversed = reversed * 10 + digit;     // append it to the reversed number
                temp /= 10;                           // remove the last digit
            }

            if (negative) {
                reversed = -reversed;
            }
            System.out.println("Reverse of " + number + " is " + reversed);
        }
    }
}
