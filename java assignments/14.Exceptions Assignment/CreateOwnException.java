
//6. Write a program to create your own exception



class InvalidExamException extends Exception {
    InvalidExamException(String msg) {
        System.out.println(msg);
    }
}

public class CreateOwnException {

    static void exam(int marks) throws InvalidExamException {
        if (marks < 40) {
            throw new InvalidExamException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

    public static void main(String[] args) {
        try {
            exam(36);
        } catch (Exception i) {
            i.printStackTrace();
        }
    }
}