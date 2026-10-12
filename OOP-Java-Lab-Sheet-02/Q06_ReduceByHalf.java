import java.util.Scanner;

/**
 * Lab Sheet-02 | Q6 (Assignment operator): Reduce a number by half using /= until it becomes less than 1,
 * counting the number of steps.
 */
public class Q06_ReduceByHalf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            double number = sc.nextDouble();

            if (number <= 0) {
                System.out.println("Please enter a number greater than 0.");
                return;
            }

            int steps = 0;
            System.out.println("Start : " + number);
            while (number >= 1) {
                number /= 2;                // compound assignment: number = number / 2
                steps++;
                System.out.println("Step " + steps + " : " + number);
            }
            System.out.println("The number became less than 1 after " + steps + " step(s).");
        }
    }
}
