
//3.Write a method which throws exception, Call that method in main class without try block




public class MethodThrowsException {
    static void throwException() {
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) {
        throwException();
    }
}