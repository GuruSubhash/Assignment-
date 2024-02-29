
//08. Create a PUBLIC interface with fields and methods, fields should have values assigned



public interface InterfacePublicFieldsMethod {
    int num = 111; 

    public void myMethod();

}

class Subhash implements InterfacePublicFieldsMethod {
    @Override
    public void myMethod() {
        System.out.println("This is a method implemented class");
    }

    public static void main(String[] args) {
        Subhash j = new Subhash();
        System.out.println("printing the values of the interface fields");
        System.out.println(num);
        System.out.println("calling the interface methods");
        j.myMethod();
    }
}