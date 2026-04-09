package ARRAYSTRING;

public class launchWrapper {
    public static void main(String[] args) {
        int x = 2; // primitive intger value
        Integer y = Integer.valueOf(4); // Object of Integer Value

        int z = Integer.valueOf(y); // New method for Object of Integer Value

        // Boxing (Primitive → object)
        Integer a = Integer.valueOf(5);  // manual boxing create a object of Inetger class
        Integer b = 5;                   // auto-boxing automatically created a obj of Intefer class

        // Unboxing (object → primitive)
        int c = a.intValue();  // manual unboxing 
        int d = a;             // auto-unboxing Normal way of int value 

        // boxing - to convert primitive int to Integer of Object
        // Unboxing - to convert Integer of Object to primitive int
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Java caches Integer objects from -128 to 127
        Integer a1 = 100;
        Integer b1 = 100;
        System.out.println(a1 == b1); // true

        Integer a2 = 200;
        Integer b2 = 200;
        System.out.println(a2 == b2); // false

    }
}
