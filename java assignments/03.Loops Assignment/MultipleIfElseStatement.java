//13. Program for multiple if else statement(The Largest number in 10,20 and 30)

public class MultipleIfElseStatementDemo {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println(a + " is the Largest Number");

        }
        else if (b > a && b > c) {
            System.out.println(b + " is the Largest Number");
        }
        else {
            System.out.println(c + " is the Largest Number");
        }
    }
}