/**
 * Lab Sheet-02 | Q18 (for loop): Print the first 20 terms of the Fibonacci sequence.
 * Each term is the sum of the previous two: 0, 1, 1, 2, 3, 5, 8, ...
 */
public class Q18_Fibonacci {
    public static void main(String[] args) {
        long first = 0;
        long second = 1;

        System.out.println("First 20 terms of the Fibonacci sequence:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
