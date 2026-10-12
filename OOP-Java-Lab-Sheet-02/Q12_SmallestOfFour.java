import java.util.Scanner;

/**
 * Lab Sheet-02 | Q12 (Ternary operator): Find the smallest of four numbers using nested ternary operators.
 */
public class Q12_SmallestOfFour {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter four numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int smallest = (a < b)
                    ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))     // a is smaller than b
                    : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));    // b is smaller than (or equal to) a

            System.out.println("The smallest number is " + smallest);
        }
    }
}
