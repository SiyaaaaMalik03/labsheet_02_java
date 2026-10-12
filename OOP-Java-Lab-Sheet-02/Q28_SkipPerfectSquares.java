/**
 * Lab Sheet-02 | Q28 (continue): Print numbers from 1 to 50, skipping all perfect squares using continue.
 * Perfect squares in this range: 1, 4, 9, 16, 25, 36, 49.
 */
public class Q28_SkipPerfectSquares {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 50 (perfect squares skipped):");

        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) {          // i is a perfect square
                continue;                    // skip the rest of this iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
