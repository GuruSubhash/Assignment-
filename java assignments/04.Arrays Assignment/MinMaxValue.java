//8. Write a function to find the minimum and maximum value of an array


import java.util.*;

public class MinMaxValue {
    static int minValue(int[] arr) {
        int min = arr[0];
        for (int j : arr)
            if (j < min)
                min = j;
        return min;
    }
    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int j : arr)
            if (j > max)
                max = j;
        return max;
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55, 66};
        System.out.println("my_arr = " + Arrays.toString(my_arr));
        System.out.println("The Maximum value in the given aray is - " + maxValue(my_arr));
        System.out.println("The Minimum value in the given aray is - " + minValue(my_arr));
    }
}