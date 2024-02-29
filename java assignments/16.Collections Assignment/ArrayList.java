/*
 1.Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
 a. Add an element to the ArrayList
 b. Iterate through the ArrayList by using Iterator object
 c. Add an element at a specific index
 d. Remove an element from the ArrayList, Remove at an index
 e. Update the element at a specific index
 f. Check the element is present at a particular index
 g. Get an element at a particular index
 h. Find out the size of the ArrayList
 i. Check the given element is present in the ArrayList
 j. Remove all elements of the ArrayList
 */

import java.util.*;

public class ArrayList {

    public static void main(String[] args) {


        ArrayList<String> con_arr_to_list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println("\nconverted list is : " + con_arr_to_list);

        System.out.println("adding elements to the ArrayList using add method using add() method");
        jala.add("six");
        jala.add("seven");
        jala.add("eight");
        jala.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("Array list is : " + con_arr_to_list);


        System.out.println("Iterating through the ArrayList by using Iterator object ");
        Iterator<String> itr = con_arr_to_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        System.out.println("Adding an element at a specific index using add() method");
        jala.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1 :");
        System.out.println("Array list is :  " + con_arr_to_list);

        System.out.println("Removing an element at a specific index using remove() method");
        jala.remove(1);
        System.out.println("\nAfter removing an element at index 1 :");
        System.out.println("Array list is :  " + con_arr_to_list);

        System.out.println("Updating the element at a specific index using set() method ");
        jala.set(1, "ONE");
        System.out.println("\nAfter updating the element at index 1 :");
        System.out.println("Array list is :  " + con_arr_to_list);

        System.out.println("\nThe element three is present at index :");
        System.out.println(con_arr_to_list.indexOf("three"));

        System.out.println("\nThe element at index 3 is :");
        System.out.println(con_arr_to_list.get(3));

        System.out.println("\nSize of the ArrayList is : ");
        System.out.println(con_arr_to_list.size());

        System.out.println("\n'two' is present in the ArrayList : ");
        System.out.println(con_arr_to_list.contains("two")); //returns boolean value

        System.out.println("Removing all elements of the ArrayList using clear() method ");
        System.out.println("\nAfter removing all elements of the ArrayList :");
        con_arr_to_list.clear();
        System.out.println("Array list is :  " + con_arr_to_list);
    }
}