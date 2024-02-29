//3. Program to equal operator and not equal operators
//4. Write a program to print the odd and even numbers

import java.util.*;

public class EvenOrOddNum {

    static void evenNumbers(int n) {
        System.out.println(" Even Numbers from 0 to " + n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    static void oddNumbers(int n) {
        System.out.println("\n Odd Numbers from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        evenNumbers(num);
        oddNumbers(num);
    }
}