
//3. Apply private, public, protected and default access modifiers to the constructor

//4. Write constructors with return type int and String

//5. Try to call the constructor multiple times with the same object

class PublicPrivateProtectedDefault {
    int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Details");}
    PublicPrivateProtectedDefault() {
        this(11);
    }

    public PublicPrivateProtectedDefault(int rollNo) {
        this("Subhash");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    private PublicPrivateProtectedDefault(String name) {
        this("MIC", "Vijayawada");
        this.name = name;
        System.out.println("Name : " + name);
    }

    protected PublicPrivateProtectedDefault(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        System.out.println("calling the constructor multiple times with the same object");
int rollno=515;
String name ="Subhash";
String clg = "MIC";
String city ="Vijayawada";
        PublicPrivateProtectedDefault c = new PublicPrivateProtectedDefault();


        new PublicPrivateProtectedDefault(rollno);

        new PublicPrivateProtectedDefault(name);
        new PublicPrivateProtectedDefault(clg, city);


    }
}