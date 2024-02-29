//16. Write a function to get the difference of largest and smallest value


import java.util.*;

public class MaxMinDiffDemo {
    static void difference_Min_Max(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int difference;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        difference = max - min;
        System.out.printf("Maximum value : %d , Minimum value : %d ", max, min);
        System.out.println("\nDifference between largest and smallest values : " + difference);
    }

    public static void main(String[] args) {
        int[] my_arr = {66,33,99,63,69};
        System.out.println("origianl array is " + Arrays.toString(my_arr));
        difference_Min_Max(my_arr);
    }
}