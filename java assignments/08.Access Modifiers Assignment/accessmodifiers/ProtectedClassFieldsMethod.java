
//3. Create a class with PROTECTED fields and methods. Access these fields and methods from any other class in the same package


public class ProtectedClassFieldsMethod {
    protected String msg;


    protected void protectedMethod() {
        System.out.println("This is a msg " + msg);
    }
}

class protectedClass_03 {
    public static void main(String[] args) {
        pc.msg = "Protected Method";
        pc.protectedMethod();
    }
}