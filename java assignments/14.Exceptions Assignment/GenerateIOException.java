
//12. Write a program to generate IOException


import java.io.*;

public class GenerateIOException {
    public static void main(String[] args) {

        File file = new File("test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fis.read();
            fis.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}