//Name: Garrett Radtke
//Date: 10/28/2025

import java.math.BigInteger;
import java.util.Scanner;

public class findFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to find its factorial: ");
        int number = input.nextInt();
        // find factorial of number
        BigInteger factorial = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);

    }

    // computes factorial recursively
    public static BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

}
