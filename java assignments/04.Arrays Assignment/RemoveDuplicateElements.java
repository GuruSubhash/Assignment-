//12. Write a method to remove duplicate elements from an array
//18. Write a program to remove the duplicate elements and return the new array


import java.util.*;

public class RemoveDuplicateElements {
    static int removerDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {66, 66, 33,99, 36,63,12,24,27,05};
        System.out.println("original array is - " + Arrays.toString(arr));
        int n = arr.length;
        n = removerDuplicate(arr, n);
        System.out.println("after removing duplicate values in the array is(like SET) : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}