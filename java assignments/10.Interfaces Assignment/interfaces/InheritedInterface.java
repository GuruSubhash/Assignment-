
//07. Create an interface and inherit it from the other interface



interface gnan {
    void methodOne();
}

interface gnan  extends gnan {
    void methodTwo();
}

class InheritedInterfaceDemo implements gnan {
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }
    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        InheritedInterface inf = new InheritedInterface();
        System.out.println("Calling the methods implemented");
        inf.methodOne();
        inf.methodTwo();
    }
}