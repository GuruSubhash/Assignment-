
//6. Use this() and super() in methods not in constructor
class Guru_Subhash {
    void method1() {
        System.out.println("Used this() and super() in methods");
    }

    void method2() {
        System.out.println("using this() to call method1 ");
        this.method1();
    }
}
class Guru extends Guru_Subhash {
    void method3() {
        System.out.println("using super() to call parent method");
        super.method2();
    }
}

public class ThisSuperInMethods {
    public static void main(String[] args) {
        Guru c = new Guru();
        c.method3();
    }
}