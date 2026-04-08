package OOPS;

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}

public class praticse {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // bcoz static methods uses compile-time binding so it decides on compile time
        // Parent.show();
        // Child.show();
    }    
}
