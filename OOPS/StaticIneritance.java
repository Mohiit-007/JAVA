package OOPS;

// Both static method and var can be inherited 

// we can inherit the static method in child class

// static methods cannot be overridden in Java.
// whenever we try to override the static method of preant class then it is case of Method hiding
// whenever we override a static method then it is acts like a specialized method

class Animal{
    static void Display(){
        System.out.print("Static parent method");
    }
}

class Dog extends Animal{
    static void Display(){   // we can inherit the parent static and then overridden the method
        System.out.print("Static child overridden method");
    }
}

public class StaticIneritance{
    public static void main(String[] args) {
        Animal d = new Dog();
        Dog.Display();
    }
}
