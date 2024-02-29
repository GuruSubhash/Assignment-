

//3. Program to equal operator and not equal operators
//4. Write a program to find the two numbers equal or not


import java.util.*;

public class Eq_NEq{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number to compare : ");
        int x = scan.nextInt();
        System.out.print("Enter second number to compare : ");
        int y = scan.nextInt();
        if (x == y) {
            System.out.println("Both are  equal");
        }
        else if (x != y) {
            System.out.println("Both are different");
        }
    }
}