//Strings Assignment 01 - 14 Problems



class StringDemo {

    public static void main(String[] args) {

        String s1 = "Guru Subhash";
        System.out.println(s1);

        String s2 = new String("Creating a string object with class data type and placed in memory \"Heap\"");
        System.out.println(s2);


        String sc1 = "This String is for ";
        String sc2 = "Concatenation";
        String con = sc1 + sc2; 
        System.out.println(con);


        String sl = "String Length";
        int len = sl.length();
        System.out.println("String Length: " + len);


        String es = "Extracting string";
        String sub = es.substring(2, 10);
        System.out.println("extracted substring : " + sub);


        String si = "Searching index";
        int i1 = si.indexOf("index");
        int i2 = si.indexOf("h",3);
        System.out.println("Starts At Index : " + i1);
        System.out.println("finding  Index of 'h' : " + i2);


        String ms = "Matching a String";
        boolean match = ms.matches("(.*)String(.*)");
        System.out.println("Matches finding using regex is : " + match);



        String cs1 = "Comparing strings";
        String cs2 = "Comparing strings";

        boolean e = cs1.equals(cs2);
        System.out.println("two strings are equal or not  - " + e);

        boolean eic = cs1.equalsIgnoreCase(cs2);
        System.out.println("two strings are comparing without case sensitive are equal or not  " + eic);

        boolean sw = cs1.startsWith("Comp");
        System.out.println("is string Starts with : " + sw);

        boolean ew = cs1.endsWith("ings");
        System.out.println("is string Ends with : " + ew);

        int ct = cs1.compareTo(cs2);
        System.out.println("Comparing the count of the matched letters in two strings " + ct);


        String ts = "   Trimming String  ";
        String trm = ts.trim();
        System.out.println("Trimmed String is : " + trm);


        String rs = "Replacing string";
        String rpl = rs.replace("g", "n");
        System.out.println("after Replacing, the new string is : " + rpl);


        String ss = "Splitting String";
        String[] spl = ss.split(" "); 

        System.out.println("Spitting where space is occured");

        for (String i : spl) {
            System.out.println("Splitted String is : " + i);
        }


        int ns = 11;
        String nTs = String.valueOf(ns);
        System.out.println("Converted Num to Str using string class : " + nTs + 22);


        int is = 11;
        String iTs = Integer.toString(is);
        System.out.println("Converted int to str using Integer class : " + iTs + 33);


        String a = "upper case";
        String b = "LOWER CASE";
        String c = a.toUpperCase();
        String d = b.toLowerCase();
        System.out.println("lower case string is Converted to upper case : " + c);
        System.out.println("upper case string is Converted to lower case : " + d);
    }
}