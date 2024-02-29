//9. Write a program to find the prime or not


import java.util.*;

public class PrimeNumber {

    static void primeNumber(int n) {
        boolean isPrime = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a Number to check if its prime number: ");
        num = new Scanner(System.in).nextInt();
        primeNumber(num);
    }
}