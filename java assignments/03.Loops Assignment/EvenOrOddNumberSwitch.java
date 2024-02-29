//11. Program to check whether a number is EVEN or ODD using switch

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number : ");
        n = new Scanner(System.in).nextInt();

        switch (n % 2) {
            case 0:
                System.out.println(n + " input number is an Even Number");
                break;
            case 1:
                System.out.println(n + "input number is an Odd Number");
                break;
        }
    }
}