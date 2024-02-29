
//5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class. Call the method




interface  subhash{
    void sameMethod();
}

interface subhash1 {
    void sameMethod();
}

class TwoInterfaceSameMethod implements subhash, subhash1{
    @Override
    public void sameMethod() {
        System.out.println("This is same method in both the interfaces but calling in class ");
    }

    public static void main(String[] args) {
        TwoInterfaceSameMethod inf = new TwoInterfaceSameMethod();
        inf.sameMethod();
    }
}