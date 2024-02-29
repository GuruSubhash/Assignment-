
//2.Write a program to write text to .txt file using OutputStream




import java.io.*;

public class WriteUsingOutputStream {

    public static void main(String args[]) {

        String data = "This text is written using OutputStream... by WriteUsingOutputStream class ";

        try {
            OutputStream fos = new FileOutputStream("os.txt");

            byte[] db = data.getBytes();

            fos.write(db);
            System.out.println("Data is written to the file... by WriteUsingOutputStream class");

            fos.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}