import java.util.Scanner;

/**
 * Lab Sheet-02 | Q17 (Shift operators): Cyclically rotate the bits of an integer to the left by 2 positions.
 * An int has 32 bits. Rotation left by 2:
 *   (n << 2)   moves bits left (the two highest bits fall out),
 *   (n >>> 30) brings those two highest bits to the lowest positions,
 *   OR (|) combines both parts.
 */
public class Q17_RotateBitsLeft {

    /** 32-bit binary string grouped in bytes, e.g. 00000000 00000000 00000000 00001101 */
    static String toBinary32(int value) {
        String bits = Integer.toBinaryString(value);
        StringBuilder sb = new StringBuilder();
        for (int i = bits.length(); i < 32; i++) {
            sb.append('0');
        }
        sb.append(bits);
        StringBuilder grouped = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            if (i > 0 && i % 8 == 0) {
                grouped.append(' ');
            }
            grouped.append(sb.charAt(i));
        }
        return grouped.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            int rotated = (number << 2) | (number >>> 30);

            System.out.println("Original (" + number + ")  : " + toBinary32(number));
            System.out.println("Rotated  (" + rotated + ")  : " + toBinary32(rotated));
        }
    }
}
