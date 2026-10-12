import java.util.Scanner;

/**
 * Lab Sheet-02 | Q23 (while loop): Determine if a number is a palindrome using a while loop.
 * A palindrome reads the same forwards and backwards (e.g. 121, 1331). Negative numbers are not treated as palindromes.
 */
public class Q23_PalindromeWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println(number + " is NOT a palindrome (negative number).");
                return;
            }

            long temp = number;
            long reversed = 0;
            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }

            if (reversed == number) {
                System.out.println(number + " is a PALINDROME.");
            } else {
                System.out.println(number + " is NOT a palindrome (reverse = " + reversed + ").");
            }
        }
    }
}
