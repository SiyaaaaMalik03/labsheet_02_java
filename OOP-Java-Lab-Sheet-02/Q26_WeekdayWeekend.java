import java.util.Scanner;

/**
 * Lab Sheet-02 | Q26 (switch-case): Take a day number (1-7) and display whether it is a weekday or weekend.
 * Assumption: 1 = Monday, 2 = Tuesday, ... 6 = Saturday, 7 = Sunday.
 */
public class Q26_WeekdayWeekend {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter day number (1-7): ");
            int day = sc.nextInt();

            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Day " + day + " is a WEEKDAY.");
                    break;
                case 6:
                case 7:
                    System.out.println("Day " + day + " is a WEEKEND.");
                    break;
                default:
                    System.out.println("Invalid day number! Enter a number between 1 and 7.");
            }
        }
    }
}
