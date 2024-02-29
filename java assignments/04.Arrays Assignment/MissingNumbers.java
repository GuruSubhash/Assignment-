//19. Write a function to find the missing number of sorted array of 1 to 100

import java.util.Arrays;

public class MissingNumbers {
    static void missingNumber(int[] arr) {
        Arrays.sort(arr);
        System.out.println("sorted array is -  " + Arrays.toString(arr));
        int j = 0;
        System.out.print("Missing numbers from 1 to 100 in the given array is - ");
        for (int i = 1; i < 100; i++) {
            if (j < arr.length && i == arr[j])
                j++;
            else
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] my_arr = {66,63,69,99,33,24,27,12,05};
        missingNumber(my_arr);
    }
}