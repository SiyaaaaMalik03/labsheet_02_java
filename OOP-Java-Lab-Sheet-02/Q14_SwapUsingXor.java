import java.util.Scanner;

/**
 * Lab Sheet-02 | Q14 (Bitwise operators): Swap two integers without a temporary variable using XOR.
 *   a = a ^ b;   b = a ^ b;   a = a ^ b;
 * Reason: x ^ x = 0 and x ^ 0 = x, so XOR-ing twice with the same value restores the original.
 */
public class Q14_SwapUsingXor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first integer (a)  : ");
            int a = sc.nextInt();
            System.out.print("Enter second integer (b) : ");
            int b = sc.nextInt();

            System.out.println("Before swapping : a = " + a + ", b = " + b);

            a = a ^ b;
            b = a ^ b;      // (a ^ b) ^ b  -> original a
            a = a ^ b;      // (a ^ b) ^ a  -> original b

            System.out.println("After swapping  : a = " + a + ", b = " + b);
        }
    }
}
