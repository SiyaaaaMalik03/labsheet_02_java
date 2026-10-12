import java.util.Scanner;

/**
 * Lab Sheet-02 | Q25 (for-each loop): Calculate the average marks of students stored in a 2D array
 * (rows = students, columns = subjects) using for-each loops.
 */
public class Q25_AverageMarks2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students : ");
            int students = sc.nextInt();
            System.out.print("Enter number of subjects : ");
            int subjects = sc.nextInt();

            if (students <= 0 || subjects <= 0) {
                System.out.println("Number of students and subjects must be greater than 0.");
                return;
            }

            int[][] marks = new int[students][subjects];
            for (int i = 0; i < students; i++) {
                for (int j = 0; j < subjects; j++) {
                    System.out.print("Enter marks of student " + (i + 1) + " in subject " + (j + 1) + ": ");
                    marks[i][j] = sc.nextInt();
                }
            }

            System.out.println();
            int studentNo = 1;
            long allMarks = 0;
            int allCount = 0;

            for (int[] row : marks) {                 // each row = marks of one student
                int sum = 0;
                for (int mark : row) {                // each element = marks in one subject
                    sum += mark;
                }
                System.out.printf("Student %d : total = %d, average = %.2f%n", studentNo, sum, (double) sum / row.length);
                allMarks += sum;
                allCount += row.length;
                studentNo++;
            }

            System.out.printf("Class average (all students, all subjects) = %.2f%n", (double) allMarks / allCount);
        }
    }
}
