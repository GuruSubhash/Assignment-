
//2. Create an interface with two methods, but implement only one in a class. Call the method implemented




interface  Subhash {
    void methodOne();

    void methodTwo();
}

public class InterfaceTwoMethod implements Subhash {
    @Override
    public void methodOne() {
        System.out.println("this is First Method in class");
    }

    @Override
    public void methodTwo() {
        System.out.println("this is Second Method in class");
    }

    public static void main(String[] args) {
        InterfaceTwoMethod inf = new InterfaceTwoMethod();
        System.out.println("Calling the methods implemented by interface ");
        inf.methodOne();
        inf.methodTwo();
        System.out.println("A class that implements an interface must implement all the methods declared in the interface...");
    }
}