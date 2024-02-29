//5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables

class VariablesDemo {
    int a = 11;
    void localVariable() {
        int a = 22;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args) {
        VariablesDemo obj1 = new VariablesDemo();
        System.out.println("Instance variable a : " + obj1.a);
        obj1.localVariable();
    }
}