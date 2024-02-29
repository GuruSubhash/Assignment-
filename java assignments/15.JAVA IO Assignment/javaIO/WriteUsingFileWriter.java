
//6.Write a program to write text to .txt file using FileWriter



import java.io.FileWriter;

public class WriteUsingFileWriter {
    public static void main(String[] args) {

        String s = "This text is written using FileWriter... by WriteUsingFileWriter class. ";

        try {
            FileWriter fw = new FileWriter("fw.txt");

            fw.write(s);
            fw.close();
            System.out.println("Data is written to the file...by WriteUsingFileWriter class.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
