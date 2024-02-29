//10.Write a program to generate ClassNotFoundException


public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("exceptions");
            ClassLoader.getSystemClassLoader().loadClass("exceptions");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}