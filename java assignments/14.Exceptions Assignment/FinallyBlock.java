
//7.Write a program with finally block



public class FinallyBlock {

    public static void main(String args[]) {
        try {
            int data = 10 / 0;
            System.out.println(data);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
            e.printStackTrace();
        }
        System.out.println("finally block executes regardless of exception occurred or not");
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Main method ended");
    }
}