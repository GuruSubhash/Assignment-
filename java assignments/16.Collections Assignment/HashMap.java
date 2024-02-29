/*
  2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
  a. Insert a Key value mapping into the map
  b. Fetch the value of a Key
  c. Create a clone/copy of HashMap
  d. Check if the given Key is in the Map
  e. Check if the value is in the Map
  f. Check if the map is empty
  g. Print the size of the Map to the console
  h. Print all the Keys of the map to the console
  j. Remove a specific Key-value pair
  k. Copy all the elements of the Map to another Map
 */


import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> h_map = new HashMap<>();


        System.out.println("Inserting Student ID as Key & Name as value using put() method");
        jala.put(1, "Deepika");
        jala.put(2, "Subhash");
        jala.put(3, "divya");
        jala.put(4, "Aakash");
        jala.put(5, "Viswas");
        jala.put(6, "Surendra");
        jala.put(7, "Phani");
        jala.put(8, "Raju");
        jala.put(9, "Yashwanth");
        jala.put(10, "Srivani");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("hashed map is : " + h_map);

        System.out.println("Fetching the value of a Key using get() method ");
        System.out.println("\nName of the Student with ID no = 6 is : ");
        System.out.println(h_map.get(6));

        System.out.println("Creating a clone/copy of HashMap using clone() method");
        System.out.println("\nclone/copy of HashMap is: ");
        System.out.println(h_map.clone());

        System.out.println("Checking if the given Key is in the Map using containsKey() method");
        System.out.println("\nID No = 3 is in the Map is : ");
        System.out.println(h_map.containsKey(3));

        System.out.println("Checking if the value is in the Map using containsValue() method");
        System.out.println("\nStudent Name = 'Subhash' is in the map :");
        System.out.println(h_map.containsValue("Subhash"));

        System.out.println("Checking if the map is empty using isEmpty() method");
        System.out.println("\nChecking if the map is empty :");
        System.out.println(h_map.isEmpty());

        System.out.println("Printing the size of the Map to the console using size() method");
        System.out.println("\nThe size of the Map is :");
        System.out.println(h_map.size());

        System.out.println("Printing all the Keys of the map to the console using keySet() method");
        System.out.println("\nAll ID No of the students :");
        System.out.println(h_map.keySet());

        System.out.println("Removing a specific Key-value pair using remove() method ");
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        jala.remove(6, "Surendra");
        System.out.println(h_map);

        System.out.println("Copying all the elements of the Map to another Map using puttAll() method");
        System.out.println("\nCopied all the elements of the jala to icfai :");

        HashMap<Integer, String> h_map2 = new HashMap<>();

        h_map2.putAll(h_map);
        System.out.println("h_map2 " +h_map2);
    }
}