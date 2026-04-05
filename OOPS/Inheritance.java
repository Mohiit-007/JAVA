package OOPS;

// types of inheritance
// 1. Single Inheritance :- parent - child
// 2. Multilevel Inheritance :- parent - child - grandchild
// 3. Heriarchial Inhertiance :- one parent - multiple child

class Animal{
    public void walk(){
        System.out.println("Animal can walk");
    }
    public void food(){
        System.out.println("Animal eats food");
    }
}

// extends keyword is used to access the properties of another class
class Dog extends Animal{
    // specailized method
    public void type(){       
        System.out.println("Type of Animal is Dog");
    }

    // overridden method is the method which change it properties from parent class to child class
    public void food(){
        System.out.println("Dogs like meat");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.walk(); // inherited method
        dg.food(); // overridden method
        dg.type(); // specialized method

    }
}
