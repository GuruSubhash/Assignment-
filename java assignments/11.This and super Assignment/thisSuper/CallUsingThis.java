
//1. Print the fields/instance members of the current class using this and without using object

//3. Call constructor of the current class using this()

//4. Call argument constructor of current class using this()


public class CallUsingThis {

    int num;
    String name;

    CallUsingThis() {
        System.out.println("Calling argument constructor of current class using this() ");
        this(66, "Subhash");
    }

    CallUsingThis(int num, String name) {
        System.out.println("Printing fields of the current class using this ");
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        CallUsingThis ts1 = new CallUsingThis();
        CallUsingThis ts = new CallUsingThis(12, "Guru_Subhash");
    }
}