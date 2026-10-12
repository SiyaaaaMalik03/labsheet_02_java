import java.util.Scanner;

/**
 * Lab Sheet-02 | Q10 (Logical operators): Determine if a given year is BOTH a leap year AND within a given range.
 */
public class Q10_LeapYearInRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter range start year : ");
            int start = sc.nextInt();
            System.out.print("Enter range end year   : ");
            int end = sc.nextInt();
            System.out.print("Enter the year to check: ");
            int year = sc.nextInt();

            if (start > end) {
                System.out.println("Invalid range: start year must not be greater than end year.");
                return;
            }

            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            boolean inRange = year >= start && year <= end;

            System.out.println("Leap year       : " + isLeap);
            System.out.println("Within range    : " + inRange);

            if (isLeap && inRange) {                       // logical AND
                System.out.println(year + " is a leap year AND lies within " + start + " - " + end + ".");
            } else {
                System.out.println(year + " does NOT satisfy both conditions.");
            }
        }
    }
}
