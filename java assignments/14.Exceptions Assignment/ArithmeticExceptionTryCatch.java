
//1. Write a program to generate Arithmetic Exception without exception handling

//2. Handle the Arithmetic exception using try-catch block



public class ArithmeticExceptionTryCatch {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            System.out.println("i'm Inside try block");
            c = a / b;
            System.out.println("c = " + c);
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

        c = a / b;
        System.out.println("without exception handling");
    }
}