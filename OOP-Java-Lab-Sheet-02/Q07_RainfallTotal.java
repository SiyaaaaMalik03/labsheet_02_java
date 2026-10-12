import java.util.Scanner;

/**
 * Lab Sheet-02 | Q7 (Assignment operator): Accumulate rainfall data for 7 days using += and find the total.
 */
public class Q07_RainfallTotal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double total = 0;

            for (int day = 1; day <= 7; day++) {
                System.out.print("Enter rainfall (in mm) for day " + day + ": ");
                double rainfall = sc.nextDouble();
                if (rainfall < 0) {
                    System.out.println("Rainfall cannot be negative; day " + day + " is counted as 0.");
                    rainfall = 0;
                }
                total += rainfall;          // compound assignment: total = total + rainfall
            }

            System.out.printf("Total rainfall in 7 days   : %.2f mm%n", total);
            System.out.printf("Average rainfall per day   : %.2f mm%n", total / 7);
        }
    }
}
