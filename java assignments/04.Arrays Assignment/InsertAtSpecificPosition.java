//7. Write a function to insert an element at a specific position in the array.


import java.util.*;

public class InsertAtSpecificPosition {
    static void insertElement(int[] arr, int index, int v) {
        for (int i = arr.length; i <= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = v;
    }

    public static void main(String[] args) {
        int index, v;
        int[] my_arr = {33,66,99,12,24,27};
        System.out.println("original Array is : " + Arrays.toString(my_arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index to be inserted at specified position : ");
        index = sc.nextInt();
        System.out.printf("Enter the value to insert at index my_arr[%d] =  ", index);
        v = sc.nextInt();
        insertElement(my_arr, index, v);

        System.out.println("after Inserting Element into the array : ");
        System.out.println("my array is -  " + Arrays.toString(my_arr));
    }
}