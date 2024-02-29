
//1. Write two methods with the same name but different number of parameters of same type and call the methods from main method

//2. Write two methods with the same name but different number of parameters of different data type and call the methods from main method

//3. Write two methods with the same name and same number of parameters of same type and call from main method

//4. Write two methods with the same name and same number of parameters of different type and call from main method

//5. Write two methods with the same name, number of parameters and data type but different return Type




public class MethodOverloading {
    int num1;
    int num2;
    int rollNo;
    String name;

    void method1(int num1) {
        this.num1 = num1;
        System.out.println("1.First number in first method : " + num1);
    }

    void method1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("First number in first method : " + num1+"\nSecond number in first method : "+ num2);
        System.out.println("Sum of two numbers : " + (num1 + num2));
    }

    void method2(int rollNo) {
        this.rollNo = rollNo; 
        System.out.println("Roll number in second method: " + rollNo);
    }
    void method2(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;    
        System.out.println("Roll number in second method : " + rollNo + " ; " + "Name in second method : " + name);
    }

    void method4(int rollNo) {
        this.rollNo = rollNo;  
        System.out.println("Roll number in forth method : " + rollNo);
    }
    void method4(String name) {
        this.name = name;  
        System.out.println("Name in forth method : " + name);
    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
        mo.method1(12);
        mo.method1(66,33);

        mo.method2(515);
        mo.method2(515, "Subhash");

        mo.method4(515);
        mo.method4("Subhash");
    }

}