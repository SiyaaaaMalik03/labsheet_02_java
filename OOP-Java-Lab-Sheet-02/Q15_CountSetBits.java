import java.util.Scanner;

/**
 * Lab Sheet-02 | Q15 (Bitwise operators): Count the number of set bits (1s) in the binary representation
 * of a number using bitwise operators.
 * (n & 1) gives the last bit; (n >>> 1) moves to the next bit. For negative numbers the 32-bit
 * two's complement representation is counted.
 */
public class Q15_CountSetBits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            int temp = number;
            int count = 0;
            while (temp != 0) {
                count += (temp & 1);       // add 1 if the last bit is set
                temp >>>= 1;               // unsigned right shift by 1
            }

            System.out.println("Binary representation : " + Integer.toBinaryString(number));
            System.out.println("Number of set bits (1s): " + count);
        }
    }
}
