
//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method

//2. Print instance variables in static methods

//3. Print static variables in Instance methods

//4. Call instance methods in static methods

//5. Call static methods in instance methods

//6. Print all the static, instance variables in main method

//7. Call static methods and instance methods in main method







class StaticDemo {

    static int static_v1 = 05;
    static int static_v2 = 27;

    int ins_v1 = 33;
    int ins_v2 = 66;

    static void staticMethod1() {
        StaticDemo obj = new StaticDemo();
        System.out.println("Instance variables in StaticDemo class are :  " + obj.ins_v1 + ", " + obj.ins_v2);
    }

    void instanceMethod1() {
        System.out.println("Static variables in StaicDemo class are :  " + static_v1 + ", " + static_v2);
    }

    static void staticMethod2() {
        StaticDemo obj1 = new StaticDemo();
        obj1.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
    }

    public static void main(String[] args) {
        StaticDemo stc = new StaticDemo();

        System.out.println("Static variables: " + static_v1 + ", " + static_v2);
        System.out.println("Instance variables: " + stc.ins_v1 + ", " + stc.ins_v2);
        System.out.println("accessing instance variables in static method ");

        staticMethod1();
        System.out.println("accessing Static variables in static method ");
        staticMethod2();
        System.out.println("accessing Static variables in static method ");
        stc.instanceMethod1();
        System.out.println("accessing instance variables in instance method ");
        stc.instanceMethod2();
    }
}