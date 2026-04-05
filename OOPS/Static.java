package OOPS;

// The static keyword is used for members that belong to the class,
// not to individual objects.

// Static can be used with:
// 1. Variables (class variables)
// 2. Methods
// 3. Blocks
// 4. Nested classes

// Static variables are loaded when the class is loaded into memory.
// No object creation is required to access them.

// Only one copy of a static variable exists, and it is shared
// among all objects of the class.

// Static variables are stored in the Method Area (Class Area),
// while objects are stored in the Heap memory.

// Static methods can be called using the class name.
// Example: Student.view();

// Static methods can directly access only static variables and methods.
// They cannot directly access instance (non-static) variables.

// Instance variables are created when an object is instantiated,
// and each object gets its own separate copy.

class Student {
    int id;
    String name;
    static String clg = "JECRC";

    public static void view() {
        System.out.println(clg);
    }
}

public class Static {
    public static void main(String[] args) {
        Student.view();
    }
}