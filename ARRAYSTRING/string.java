 package ARRAYSTRING;

// the s1 and s3 on compare return true bcoz they are created in Strng constant pool(SCP) on same memory and it is
// resolved at compile time
//while 

//String are immutable in java
// == comapres on basis of ref. of obj that which memry add. is pointing to
// if use new method with String then a new obj created in heap

public class string {
    public static void main(String[] args) {
        String s1 = "Mohit";
        String s2 = new String("Mohit");
        String s4 = new String("Mohit").intern(); // move to String constant pool

        String s3 = "Mohit";

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equalsIgnoreCase(s2)); 

        String a = "MOHIT";
        String b = "ROHIT";
        System.out.println(a.compareTo(b)); // to compare char diff.

        String str = "Mohit Sahu";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(4));
        System.out.println(str.endsWith("Sahu"));
        System.out.println(str.length());
        System.out.println(str.startsWith("Mohit"));
        System.out.println(str.startsWith("M"));
        char ch[] = str.toCharArray();
        for(char c : ch){
            System.out.println(c);
        }
        
        System.out.println(str.substring(0,7));
        System.out.println(str.substring(5));
        System.out.println(str.contains("Mohit"));
        System.out.println(str.hashCode());
        System.out.println(str.startsWith("M"));
        System.out.println(str.replace("Sahu", "Rohit"));

        String curr = "Mohit";
        curr = "rohit sahu";
        System.out.println(curr);

        String x = "Mohit"; //Also stored in String Pool
        String y = " Sahu"; //Also stored in String Pool
        String z = "Mohit Sahu"; //Also stored in String Pool
        String x1 = x.concat(y); //Creates a new String object in heap, NOT in pool
        System.out.println(x1 == z); // z is in pool memory and x1 is in heap memory

        String m = "mohit";
        String n = "MOHIT"; //create a obj in string pool constant
        m = m.toUpperCase(); // craeate a new obj. in heap
        System.out.println(m == n); // compare by refrences
        System.out.println(m);

        String x2 = "Mo";
        String a1 = x2 + "hit";   // runtime
        String b1 = "Mohit";
        System.out.println(a1 == b1);

        System.out.println(10 + 2 + "Mohit");
        System.out.println("Mohit" + 10 + 2);

    }
} 
