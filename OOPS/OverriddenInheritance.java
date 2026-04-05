package OOPS;

// 1. We cannot decrease visibility of overridden methods in child class however we can increase visibility
// 2. We cannot change return type of overridden method in child class
// 3. We can change return type of overridden method in child class if its co-variant return type
// 4. We cannot change parameter as specialized method

class Animal {
    int age  = 10;

    void walk(){
        System.out.println("Animals can walk");
    }
}

class Dog extends Animal{
    // make it public increase visibilty
    public void display(){
        System.out.println("Hello");
    }

    // Can't change return type of overridden methods
    // int show(){ 
    //     System.out.println("Hello");
    // }
}

public class OverriddenInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
