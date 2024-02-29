
//9. Write a program to generate ArrayIndexOutOfBoundException



public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        System.out.println("Declaring 4 elements in the String array");
        String[] arr = {"Subhash", "Guru", "divya", "deepika"};
        System.out.println("ArrayIndexOutOfBoundException because there is no 5th index");
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}