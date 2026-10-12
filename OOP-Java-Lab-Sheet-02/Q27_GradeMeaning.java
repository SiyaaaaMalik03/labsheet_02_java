import java.util.Scanner;

/**
 * Lab Sheet-02 | Q27 (switch-case): Take a grade (A-F) and print its qualitative meaning.
 */
public class Q27_GradeMeaning {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter grade (A-F): ");
            char grade = Character.toUpperCase(sc.next().charAt(0));

            switch (grade) {
                case 'A':
                    System.out.println("Grade A : Excellent");
                    break;
                case 'B':
                    System.out.println("Grade B : Good");
                    break;
                case 'C':
                    System.out.println("Grade C : Average");
                    break;
                case 'D':
                    System.out.println("Grade D : Below Average");
                    break;
                case 'E':
                    System.out.println("Grade E : Poor");
                    break;
                case 'F':
                    System.out.println("Grade F : Fail");
                    break;
                default:
                    System.out.println("Invalid grade! Enter a grade from A to F.");
            }
        }
    }
}
