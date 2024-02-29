
//14.Write a program to generate NoSuchMethodException



import java.lang.reflect.Method;
class Subhash {
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}

public class NoSuchMethod {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("exceptions.Subhash");
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        }
        catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}