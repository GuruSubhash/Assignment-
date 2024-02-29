
//4. Create a class with PUBLIC fields and methods


class PublicClassDemo{

    public String pName = "Public";

    public void publicMethod() {
        System.out.println("This is publicly declared name " + pName);
    }
}
public class PublicClassFieldsMethods {
    public static void main(String[] args) {
        PublicClassDemo pub = new PublicClassDemo();
        pub.pName = "Public Method";
        pub.publicMethod();
    }
}