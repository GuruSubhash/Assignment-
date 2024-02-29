//1. How to create a class, object, method and its signature.

public class COB {

    void isMethod() {
        String a = "This is a Method IN SAME class";
        System.out.println(a);
    }

    public static void main(String[] args) {
        COB obj1 = new COB();
        obj1.isMethod();
    }
}