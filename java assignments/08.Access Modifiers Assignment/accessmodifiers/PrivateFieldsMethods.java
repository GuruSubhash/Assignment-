
//1. Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method.


public class PrivateFieldsMethodsDemo {
    private String name = "Guru Subhash";
    private int age = 20;

    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

    public static void main(String[] args) {
        PrivateFieldsMethods obj = new PrivateFieldsMethods();
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println("calling private method");
        obj.pvtMethod();

        System.out.println("So subclass does not inherit the private members of its parent class ")
    }
}