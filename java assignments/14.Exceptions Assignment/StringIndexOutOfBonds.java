
//17. Write a program to generate StringIndexOutOfBoundsException



public class StringIndexOutOfBonds {
    public static void main(String[] args) {

        String str = "Subhash";
        try {
            System.err.println("Trying to access at negative index");
            char charAtNegativeIndex = str.charAt(-1);
            System.err.println("Trying to access at index equal to size of the string");
            char charAtLengthIndex = str.charAt(11);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}