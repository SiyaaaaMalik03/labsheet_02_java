import java.util.Scanner;

/**
 * Lab Sheet-02 | Q30 (Mixed advanced): Shift operators + bitwise operators + for loop + continue + break.
 *   1. Check if the number is a power of 4 using shift operators.
 *   2. Toggle the 3rd bit (bit position 2, counting from the right starting at 0) using bitwise XOR.
 *   3. Print the multiplication table of the number using a for loop, skipping multiples of 6 (continue).
 *   4. Stop (break) as soon as a multiple of 48 is reached.
 *
 * Note: every multiple of 48 is also a multiple of 6, so the multiple-of-48 check is done FIRST;
 * otherwise "continue" would skip those values and the break could never happen.
 * The table is printed for i = 1 to 20 unless the loop stops earlier.
 */
public class Q30_MixedAdvanced {

    static String toBinary(int value) {
        return Integer.toBinaryString(value);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a number greater than 0.");
                return;
            }

            // ---- 1. Power of 4 using shift operators ----
            // A power of 4 has a single 1-bit at an even position, so shifting right by 2 bits
            // (dividing by 4) repeatedly must finally give exactly 1.
            int temp = number;
            while (temp > 1 && (temp & 3) == 0) {
                temp >>= 2;
            }
            boolean powerOfFour = (temp == 1);
            System.out.println(number + (powerOfFour ? " IS" : " is NOT") + " a power of 4.");

            // ---- 2. Toggle the 3rd bit using bitwise XOR ----
            int toggled = number ^ (1 << 2);
            System.out.println("Binary before toggling 3rd bit : " + toBinary(number) + " (" + number + ")");
            System.out.println("Binary after  toggling 3rd bit : " + toBinary(toggled) + " (" + toggled + ")");

            // ---- 3 & 4. Multiplication table with continue and break ----
            System.out.println("Multiplication table of " + number + " (multiples of 6 skipped, stops at a multiple of 48):");
            for (int i = 1; i <= 20; i++) {
                long product = (long) number * i;

                if (product % 48 == 0) {
                    System.out.println("Reached " + product + " (multiple of 48). Stopping the table.");
                    break;
                }
                if (product % 6 == 0) {
                    continue;
                }
                System.out.println(number + " x " + i + " = " + product);
            }
        }
    }
}
