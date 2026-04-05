package OOPS;

// Note : abstract and final cannot be used at once -- > it is illegal combination


// Abstract - yet to be Completed
// 1. In Java we can have method without body/definition and such methods are called as
// abstract and are declared using abstract keyword
// 2. If any one method of a class is abstract then class must be declared as abstract
// 3. We cannot create object/instance of abstract class
// 4. We can create ref to achieve polymorphism
// 5. a class can be abstract and method can be abstract but a variable and constructor cannot be abstract

abstract class Animal {
    int age  = 10;

    abstract void display(); // incomplete method so it is abstract
    abstract void show();

    void walk(){
        System.out.println("Animals can walk");
    }
}

// No Abstract method is overridden so Cat class is overidden
abstract class Cat extends Animal{
    void walk(){
        System.out.println("Animals can walk");
    }
}

class Dog extends Animal{
    void display(){
        System.out.println("Hello");
    }

    void show(){
        System.out.println("Hello");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        // Animal a = new Animal(); can not make object of abstract class
    }
}
