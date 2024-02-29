
//2. Print the fields/instance members of the parent class using super

//5. Call constructor of the parent class using super()



class Subhash {
    String name = "Guru Subhash";

    Subhash() {
        System.out.println("This is parent class constructor");
    }
}

class Guru_Subhash extends Subhash{
    String name = "Jala";

    Guru_Subhash() {
        System.out.println("Calling constructor of the parent class using super()");
        super();
        System.out.println("This is child class constructor");
    }

    void myMethod() {
        System.out.println("Printing name field of the parent class using super");
        System.out.println("My name is " + super.name);
    }
}

public class CallUsingSuperDemo {
    public static void main(String[] args) {
        System.out.println("new Class_Name() --> is keyword for constructor calling");
        Guru_Subhash c = new Guru_Subhash();
        c.myMethod();
    }
}