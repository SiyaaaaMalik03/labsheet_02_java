import java.util.Scanner;

/**
 * Lab Sheet-02 | Q13 (Ternary operator): Check if a character is a vowel, consonant, digit or special symbol
 * using the ternary operator.
 */
public class Q13_CharacterTypeTernary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            char lower = Character.toLowerCase(ch);
            boolean isVowel = (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u');

            String type = Character.isLetter(ch)
                    ? (isVowel ? "Vowel" : "Consonant")
                    : (Character.isDigit(ch) ? "Digit" : "Special symbol");

            System.out.println("'" + ch + "' is a(n) " + type + ".");
        }
    }
}
