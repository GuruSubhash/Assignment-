//5. Write a program to print largest number among three numbers

import java.util.*;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {

        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = scan.nextInt();
        System.out.print("Enter Second Number : ");
        b = scan.nextInt();
        System.out.print("Enter Third Number : ");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("The Largest Number  among three numbers is :" + a);
        }
        else if ((b > a) && (b > c)) {
            System.out.println("The Largest Number  among three numbers is : " + b);
        }
        else {
            System.out.println("The Largest Number among three numbers is : " + c);
        }
    }
}