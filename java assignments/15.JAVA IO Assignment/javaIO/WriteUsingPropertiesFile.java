//10.Write a program to write data to properties file



import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
    public static void main(String args[]) {

        try {
            Properties props = new Properties();
            props.put("Name", "Subhash");
            props.put("E.no", "515");
            props.put("College", "MIC Tech");

            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
            props.store(outputStrem, "This is a sample properties file... BY WriteUsingPropertiesFile class .");
            System.out.println("Properties file created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}