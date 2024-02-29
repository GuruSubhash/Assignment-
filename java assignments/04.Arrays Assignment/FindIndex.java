//3. Write a program to find the index of an array element.

import java.util.*;

public class FindIndex {
    static void arrIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++)
            if (n == arr[i]) {
                System.out.println(n + "This number is at index of " + i);
                return;
            }
    }

    public static void main(String[] args) {
        int index;
        int[] arr = {33,66,99,36,69,63};
        System.out.println("original array is " + Arrays.toString(arr));
        System.out.print("enter a value to find Index of array : ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextByte();
        arrIndex(arr, index);
    }
}