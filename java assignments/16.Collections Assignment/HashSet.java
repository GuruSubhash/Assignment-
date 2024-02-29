

//3.Create a HashSet with at least 10 elements of type String - Write program covering all the operations of HashSet


import java.util.*;
public class HashSet {
    public static void main(String[] args) {

        HashSet<String> h_set = new HashSet<>();

        System.out.println("adding elements to the HashSet using add() method");
        h_set.add("zero");
        h_set.add("one");
        h_set.add("two");
        h_set.add("three");
        h_set.add("four");
        h_set.add("five");
        h_set.add("six");
        h_set.add("seven");
        h_set.add("eight");
        h_set.add("nine");
        h_set.add("ten");
        h_set.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        System.out.println("hash set is : " + h_set);


        System.out.println("Iterating through the HashSet by using Iterator object");
        Iterator<String> itr = h_set.iterator();
        System.out.print("\nIterating through the HashSet :  ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        System.out.println("Create a clone/copy of HashSet using clone() method");
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(h_set.clone());

        System.out.println("Removing a specific element using remove() method");
        h_set.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("hash set is : " + h_set);

        System.out.println("Checking if the set is empty using isEmpty() method");
        System.out.println("\nChecking if the set is empty :");
        System.out.println(h_set.isEmpty());


        System.out.println(" Finding the size of the HashSet using size() method");
        System.out.println("\nSize of the HashSet : ");
        System.out.println(h_set.size());

        System.out.println("Checking if element is present in the HashSet using contains() method");
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(h_set.contains("one")); 

        System.out.println("Removing all elements of the HashSet using clear() method");
        System.out.println("\nAfter removing all elements of the HashSet :");
        h_set.clear();
        System.out.println("hash set is : " + h_set);
    }
}