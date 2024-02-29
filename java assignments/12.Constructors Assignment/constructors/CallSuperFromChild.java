//02. Call the constructors(both default and argument constructors) of super class from a child class




class Guru_Subhash{
    String name,branch;
    int rollno;
    Guru_Subhash(){
    
    System.out.println("this is default method in parent class ");
   }

    Guru_Subhash(int roll_no) {
 
    this.rollno = rollno;
    }

    Guru_Subhash(String name, String branch){

    this.name=name;
    this.branch = branch;
    }

}


class Guru extends Guru_Subhash {

    String clg;
    String city;

    Guru() {
        super();
    }

    Guru(int rollNo) {
        super(rollNo);
    }
    
    Guru(String name, String branch, String clg, String city) {
        super(name, branch);
        this.clg = clg;
        this.city = city;
        System.out.println("College : " + this.clg);
    }
}

class CallSuperFromChildDemo {
    public static void main(String... args) {
        System.out.println("creating objects and passing values by constructors");
        new Guru();
        new Guru(317);
        new Guru("Subhash", "CSE", "MIC","Vijayawada");
    }
}