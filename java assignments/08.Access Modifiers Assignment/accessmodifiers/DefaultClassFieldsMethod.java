
//2. Create a class with DEFAULT fields and methods. Access these fields and methods from any other class in the same package


class DefaultClass_02 {
    int myAge;
    String myName;

    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}

public class DefaultClassFieldsMethod {
    public static void main(String[] args) {
        DefaultClass_02 obj = new DefaultClass_02();
        obj.myAge = 20;
        obj.myName = "Guru Subhash ";
        obj.defaultMethod();
    }
}