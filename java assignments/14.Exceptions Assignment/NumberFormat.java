
//16. Write a program to generate NumberFormatException



public class NumberFormat {
    public static void main(String[] args) {

        String str = "Guru Subhash";
        try {
            int x = Integer.parseInt(str);
            int y = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught! because formatiing String to integer or value cannot takes place ");
            e.printStackTrace();
        }
    }
}