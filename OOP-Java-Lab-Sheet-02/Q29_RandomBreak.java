import java.util.Random;

/**
 * Lab Sheet-02 | Q29 (break): Generate random integers between 1 and 100 and stop (break)
 * when a number divisible by both 7 and 13 is found. (Only 91 satisfies this in the range 1-100.)
 */
public class Q29_RandomBreak {
    public static void main(String[] args) {
        Random random = new Random();
        int attempts = 0;

        System.out.println("Generating random numbers between 1 and 100:");
        while (true) {
            int number = random.nextInt(100) + 1;      // 1 to 100
            attempts++;
            System.out.print(number + " ");
            if (attempts % 10 == 0) {
                System.out.println();                  // 10 numbers per line
            }

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println();
                System.out.println("Found " + number + ", divisible by both 7 and 13, after " + attempts + " attempt(s).");
                break;                                 // leave the loop
            }
        }
    }
}
