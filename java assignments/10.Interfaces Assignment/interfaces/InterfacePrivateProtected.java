
//09. Create a PRIVATE or PROTECTED interface and print the values as above scenario

//10. Create an interface with private, public and protected fields

//11.  Create an interface with static final variable



interface Jala_09 {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
}

class InterfacePrivateProtected implements Jala_09 {

    public static void main(String[] args) {
        InterfacePrivateProtected inf = new InterfacePrivateProtected();
        System.out.println(inf.num1 + " " + inf.num2);
        System.out.println("If the members of the interface are private you cannot provide implementation to the methods or, cannot access the fields of it in the implementing class...");

    }

}