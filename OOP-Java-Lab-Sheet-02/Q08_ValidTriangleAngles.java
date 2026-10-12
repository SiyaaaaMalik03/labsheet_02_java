import java.util.Scanner;

/**
 * Lab Sheet-02 | Q8 (Relational operators): Check whether three angles form a valid triangle.
 * Valid triangle: every angle is greater than 0 and the sum of the three angles is exactly 180 degrees.
 */
public class Q08_ValidTriangleAngles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first angle  : ");
            double a = sc.nextDouble();
            System.out.print("Enter second angle : ");
            double b = sc.nextDouble();
            System.out.print("Enter third angle  : ");
            double c = sc.nextDouble();

            double sum = a + b + c;
            boolean allPositive = a > 0 && b > 0 && c > 0;
            boolean sumIs180 = Math.abs(sum - 180) < 1e-9;      // tolerance for decimal angles

            System.out.println("Sum of the angles = " + sum);
            if (allPositive && sumIs180) {
                System.out.println("VALID triangle.");
            } else {
                System.out.println("NOT a valid triangle (all angles must be > 0 and their sum must be 180).");
            }
        }
    }
}
