import java.util.Scanner;

/**
 * Lab Sheet-02 | Q3 (Arithmetic operators): Distance between two points in a 2D plane.
 *   distance = sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
 */
public class Q03_DistanceBetweenPoints {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x1 and y1 of the first point  : ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            System.out.print("Enter x2 and y2 of the second point : ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double dx = x2 - x1;
            double dy = y2 - y1;
            double distance = Math.sqrt(dx * dx + dy * dy);

            System.out.printf("Distance between (%.1f, %.1f) and (%.1f, %.1f) = %.4f%n", x1, y1, x2, y2, distance);
        }
    }
}
