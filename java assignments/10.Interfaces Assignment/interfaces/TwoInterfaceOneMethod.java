

//04.Create two interfaces with one method each. Implement these two interfaces in one class



interface subhash {
    void methodOne();
}

interface subhash {
    void methodTwo();
}

//Implemented these two interfaces in one class
public class TwoInterfaceOneMethod implements subhash, subhash {
    @Override
    public void methodOne() {
        System.out.println("This is Method one in TwoInterfaceOneMethod ");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is Method two in TwoInterfaceOneMethod ");
    }

    public static void main(String[] args) {
        TwoInterfaceOneMethod inf = new TwoInterfaceOneMethod();
        inf.methodOne();
        inf.methodTwo();
    }
}