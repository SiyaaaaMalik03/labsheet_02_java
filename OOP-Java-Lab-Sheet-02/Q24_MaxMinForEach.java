import java.util.Scanner;

/**
 * Lab Sheet-02 | Q24 (for-each loop): Find the maximum and minimum values in an integer array using a for-each loop.
 */
public class Q24_MaxMinForEach {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many elements? ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("The array must have at least one element.");
                return;
            }

            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            int max = numbers[0];
            int min = numbers[0];
            for (int value : numbers) {            // for-each loop
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }

            System.out.println("Maximum value = " + max);
            System.out.println("Minimum value = " + min);
        }
    }
}
