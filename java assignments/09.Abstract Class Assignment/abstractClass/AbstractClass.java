

//01. Create an abstract class with abstract and non-abstract methods

//02. Create a subclass for an abstract class. Create an object in the child class for the abstract class and access the non-abstract methods


//03. Create an instance for the child class in child class and call abstract methods

//04. Create an instance for the child class in child class and call non-abstract methods


abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        Animal A = new Lion();
        System.out.println("accessing the non-abstract methods");
        A.eat();


        Lion L = new Lion();
        System.out.println("calling abstract methods");
        L.sound();
        System.out.println("calling non-abstract methods");
        L.eat();
    }
}