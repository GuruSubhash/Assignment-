

//3. Also, Access the PROTECTED fields and methods from child class located in a different package


import accessmodifiers.ProtectedClassFieldsMethod;

public class AccessingProtectedFieldsMethod extends ProtectedClassFieldsMethod {

    public static void main(String[] args) {
        AccessingProtectedFieldsMethod sub = new AccessingProtectedFieldsMethod();
        sub.name = "Protected Method in SubClass";
        sub.protectedMethod();
        System.out.println("protected member can be access within the package and outside the package but within the child classes");
    }
}