//2. Write a method for increment and decrement operators(++, --)

public class IncDecDemo {

    static void preIncrement(int a, int b) {
        int d;                  
        d = b + (++a);          
        System.out.println("Value of  a incrementing before addition  : " + a + "," + d);
    }

    static void postIncrement(int a, int b) {
        int d;                  
        d = b + (a++);          
        System.out.println("Value of  a incrementing after addition : " + a + "," + d);
    }

    static void preDecrement(int a, int b) {
        int d;                  
        d = b + (--a);          
        System.out.println("Value of  a decrementing before addition : " + a + "," + d);
    }

    static void postDecrement(int a, int b) {
        int d;                  
        d = b + (a--);          
        System.out.println("Value of  a decrementing after addition  : " + a + "," + d);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        preIncrement(a, b);
        postIncrement(a, b);
        preDecrement(a, b);
        postDecrement(a, b);
    }
}