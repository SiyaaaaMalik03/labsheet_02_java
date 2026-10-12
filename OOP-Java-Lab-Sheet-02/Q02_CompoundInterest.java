import java.util.Scanner;

/**
 * Lab Sheet-02 | Q2 (Arithmetic operators): Compound interest for a given principal, rate and time.
 *   Amount            A  = P * (1 + R/100)^T      (interest compounded annually)
 *   Compound interest CI = A - P
 */
public class Q02_CompoundInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter principal amount (P)      : ");
            double principal = sc.nextDouble();
            System.out.print("Enter annual rate of interest % : ");
            double rate = sc.nextDouble();
            System.out.print("Enter time in years (T)         : ");
            double time = sc.nextDouble();

            double amount = principal * Math.pow(1 + rate / 100, time);
            double compoundInterest = amount - principal;

            System.out.printf("Total amount        : %.2f%n", amount);
            System.out.printf("Compound interest   : %.2f%n", compoundInterest);
        }
    }
}
