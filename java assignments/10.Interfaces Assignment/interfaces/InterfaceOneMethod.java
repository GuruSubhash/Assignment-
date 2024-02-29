//01. Create an interface with only one method and implement it in a class. Call the method imlemented


interface Jala_01 {
    void oneMethod();
}

public class InterfaceOneMethod implements Jala_01 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method in class ");
    }

    public static void main(String[] args) {
        InterfaceOneMethod inf new InterfaceOneMethod();
        System.out.println("Calling the method implemented ");
        inf.oneMethod();
    }
}