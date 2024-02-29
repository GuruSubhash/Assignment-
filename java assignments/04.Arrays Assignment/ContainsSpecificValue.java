//4. Write a function to test if array contains a specific value

import java.util.*;

public class ArrayContainsSpecificValue {
    static boolean contains(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[] arr = {33,36,39,66,63,69};
        System.out.print("Enter the value which should be searched : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean hasValue = contains(arr, n);
        if (hasValue) {
            System.out.println("Contains this number " + n + " in the array");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Does not Contains this number " + n + " in the array");
            System.out.println("Array is - "+Arrays.toString(arr));
        }
    }
}