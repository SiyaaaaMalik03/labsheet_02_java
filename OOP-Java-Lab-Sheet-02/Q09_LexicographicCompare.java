import java.util.Scanner;

/**
 * Lab Sheet-02 | Q9 (Relational operators): Compare two strings in lexicographic (dictionary) order
 * WITHOUT using compareTo()/equals(): characters are compared with the relational operators < and >.
 * The comparison is case-sensitive (uppercase letters come before lowercase letters in Unicode/ASCII).
 */
public class Q09_LexicographicCompare {

    /** Returns -1 if s1 comes before s2, 1 if s1 comes after s2, 0 if both are equal. */
    static int compareStrings(String s1, String s2) {
        int minLength = (s1.length() < s2.length()) ? s1.length() : s2.length();

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {
                return -1;
            }
            if (c1 > c2) {
                return 1;
            }
        }
        // All common characters are equal: the shorter string comes first
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string  : ");
            String s1 = sc.nextLine();
            System.out.print("Enter second string : ");
            String s2 = sc.nextLine();

            int result = compareStrings(s1, s2);
            if (result < 0) {
                System.out.println("\"" + s1 + "\" comes BEFORE \"" + s2 + "\" in lexicographic order.");
            } else if (result > 0) {
                System.out.println("\"" + s1 + "\" comes AFTER \"" + s2 + "\" in lexicographic order.");
            } else {
                System.out.println("Both strings are EQUAL.");
            }
        }
    }
}
