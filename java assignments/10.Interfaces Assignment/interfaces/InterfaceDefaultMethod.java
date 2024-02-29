

//06. Create an interface with a default method and implement it in a class. Do not provide implementation to the default method and call the method.



interface subhash {
    default void defaultMethod() {
        System.out.println("This is a default method in interface ");
    }
}

class InterfaceDefaultMethod implements subhash {
    public static void main(String[] args) {
        InterfaceDefaultMethod inf = new InterfaceDefaultMethod();
        inf.defaultMethod();
    }
}