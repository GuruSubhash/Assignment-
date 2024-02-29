//15. Write a method to find number of even number and odd numbers in an array

import java.util.Arrays;

public class EvenOddNumsDemo {
    static void evenNumber(int[] arr) {
        System.out.print("Even numbers in given array : ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
    static void oddNumber(int[] arr) {
        System.out.print("\nOdd numbers in given array : ");
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.print(j + "  ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {33,66,99,36,63,69};
        System.out.println("a[] = " + Arrays.toString(arr));
        evenNumber(arr);
        oddNumber(arr);
    }
}