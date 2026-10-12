/**
 * Lab Sheet-02 | Q19 (for loop): Print all Armstrong numbers between 1 and 1000.
 * An n-digit number is an Armstrong number if the sum of its digits, each raised to the power n,
 * equals the number itself (e.g. 153 = 1^3 + 5^3 + 3^3). Single-digit numbers (1-9) also qualify.
 */
public class Q19_ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {
            // count the digits of the number
            int digits = 0;
            for (int temp = number; temp > 0; temp /= 10) {
                digits++;
            }

            // sum of each digit raised to the power 'digits'
            int sum = 0;
            for (int temp = number; temp > 0; temp /= 10) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }
                sum += power;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
