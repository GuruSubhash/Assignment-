
//1. Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class



class Guru_Subhash {
    int rollNo;
    String name;
    String branch;

    Guru_Subhash() {
        System.out.println("Student Details");
    }

    Guru_Subhash(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No : " + this.rollNo);
    }

    Guru_Subhash(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }
}

public class DefaultOneTwoArgument {
    public static void main(String... args) {
        new ParentClass_01();
        new ParentClass_01(515);
        new ParentClass_01("Subhash", "CSE");
    }
}