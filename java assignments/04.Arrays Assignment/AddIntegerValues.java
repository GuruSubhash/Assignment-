//1. Write a function to add integer values of an array

public class AddIntegerInArray {

    static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i : arr)
            System.out.print(i + " + ");
        System.out.print(" =  " + arrSum(arr));
    }
}