//8. Write a program to find Armstrong number or not.

import java.util.*;
public class ArmstrongNum {

    static boolean isArmstrongNum(int n) {
        int r, result = 0;
        int temp = n;
        while (n != 0) {
            r = n % 10;
            result += (r * r * r);
            n = n / 10;
        }
        return temp == result;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = new Scanner(System.in).nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
        
    }
}