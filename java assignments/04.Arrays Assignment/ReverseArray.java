//9. Write a function to reverse an array of integer values


import java.util.*;

public class ReverseOrderArray {
    static void reverseArray(int[] arr) {
        int[] r_arr = new int[arr.length];
        int j = arr.length;
        for (int i : arr) {
            r_arr[j - 1] = i;
            j = j - 1;
        }
        System.out.println("Reversed Order Array is   " + Arrays.toString(r_arr));
    }

    public static void main(String[] args) {
        int[] my_arr = {33,66,99,63,36,12};
        System.out.println("Original Array is : " + Arrays.toString(my_arr));
        reverseArray(my_arr);
    }
}