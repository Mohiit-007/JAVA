package ARRAYSTRING;

//String Builder and String Buffer can be mutated
// StringBuilder is used most of time than StringBuffer bcoz it supports asynchronousprogramming
// it does not create a obj for nee append string it perform all operation for the same string in memory

public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Mohit");
        //append to push backward
        s.append(" sahu ");
        s.append("is a good");
        s.append(" developer");

        // to insert anywhere in String
        s.insert(0, "Mr. ");
        System.out.println(s);

        //to delete
        s.delete(5, 8);
        System.out.println(s);
        
        //replace 
        s.replace(4, 6, "rohit");
        System.out.println(s);

        //reverse
        s.reverse();
        System.out.println(s);

    }
}
