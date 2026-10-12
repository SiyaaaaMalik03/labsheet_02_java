import java.util.Scanner;

/**
 * Lab Sheet-02 | Q1 (Arithmetic operators): Area of a triangle from its three sides using Heron's formula.
 *   s    = (a + b + c) / 2
 *   area = sqrt( s (s - a) (s - b) (s - c) )
 */
public class Q01_HeronFormula {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side a: ");
            double a = sc.nextDouble();
            System.out.print("Enter side b: ");
            double b = sc.nextDouble();
            System.out.print("Enter side c: ");
            double c = sc.nextDouble();

            // A triangle is possible only if all sides are positive and the sum of any two sides > third side
            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("These sides cannot form a valid triangle.");
            } else {
                double s = (a + b + c) / 2;                                  // semi-perimeter
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Semi-perimeter (s)  = " + s);
                System.out.printf("Area of the triangle = %.2f square units%n", area);
            }
        }
    }
}
