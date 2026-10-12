import java.util.Scanner;

/**
 * Lab Sheet-02 | Q21 (do-while loop): Display all factors of a number using a do-while loop.
 */
public class Q21_FactorsDoWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a number greater than 0.");
                return;
            }

            System.out.print("Factors of " + number + ": ");
            int i = 1;
            do {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= number);
            System.out.println();
        }
    }
}
