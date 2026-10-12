import java.util.Scanner;

/**
 * Lab Sheet-02 | Q11 (Logical operators): Check if a student passes a course.
 * Pass condition: (theory >= 40% AND practical >= 50%) OR overall >= 50%
 * (&& has higher precedence than ||, so the condition is evaluated exactly as written.)
 */
public class Q11_CoursePassCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter theory marks obtained    : ");
            double theory = sc.nextDouble();
            System.out.print("Enter maximum theory marks     : ");
            double theoryMax = sc.nextDouble();
            System.out.print("Enter practical marks obtained : ");
            double practical = sc.nextDouble();
            System.out.print("Enter maximum practical marks  : ");
            double practicalMax = sc.nextDouble();

            if (theoryMax <= 0 || practicalMax <= 0 || theory < 0 || practical < 0
                    || theory > theoryMax || practical > practicalMax) {
                System.out.println("Invalid marks entered.");
                return;
            }

            double theoryPercent = theory / theoryMax * 100;
            double practicalPercent = practical / practicalMax * 100;
            double overallPercent = (theory + practical) / (theoryMax + practicalMax) * 100;

            System.out.printf("Theory     : %.2f%%%n", theoryPercent);
            System.out.printf("Practical  : %.2f%%%n", practicalPercent);
            System.out.printf("Overall    : %.2f%%%n", overallPercent);

            if ((theoryPercent >= 40 && practicalPercent >= 50) || overallPercent >= 50) {
                System.out.println("Result     : PASS");
            } else {
                System.out.println("Result     : FAIL");
            }
        }
    }
}
