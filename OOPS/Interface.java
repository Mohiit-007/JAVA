//package OOPS;
//// Multiple inheritance (ONLY possible with interfaces)
//// Java does NOT allow:
//// class A extends B, C ❌
//// But allows:
//// class A implements B, C ✅
//
//// --> No Constructor in Interface class
//// -- > Interface is a way of specifying the requirement that needs to
//// be implemented
//// -- > we use interface keyword to create interface in Java
//// -- > All the methods in Java Interface are by default public and abstract irrespective
//// of you have specified or not
//// -- > Multiple classes can implement one interface
//// -- > We cannot create Object/instance of interface
//// -- > We can create ref of interface to achieve polymorphism
//// -- > interface helps to achieve standardization
//// -- > One interface can extends another interface
//// -- > interface can extend multiple other interfaces
//// -- > One interface cannot implement another interface
//// -- > One class can implement multiple interfaces at a time
//// -- > A class can extend another class and implement an interface at a time and
//// in this case first extends then implements comes into picture
//// -- > In an interface we can declare variables however all variables in an interface
//// are public static final by nature;
//// -- > In an interface we can have methods with body and those methods are
//// called as default methods and is declared with default keyword
//// -- > default methods of an interface gets inherited in implementing classed however its
//// not mandatory to override
//// -- > we can also have static and private methods but these will not be inherited in implementing
//// classes
//
//interface Animal {
//    void show();
//}
//
//interface WaterAnimal {
//    void swim();
//}
//
//// Interface extending multiple interfaces
//interface Lion extends Animal, WaterAnimal {
//    void display();
//}
//
//class Dog implements Animal {
//    public void show() {
//        System.out.println("Dog barking");
//    }
//}
//
//class Crocs implements Animal, WaterAnimal {
//    public void show() {
//        System.out.println("Crocodile on land");
//    }
//
//    public void swim() {
//        System.out.println("Crocodile swimming");
//    }
//}
//
//class Fish extends Crocs {
//    public void show() {
//        System.out.println("Fish in water");
//    }
//}
//
////public class Interface {
////    public static void main(String[] args) {
////        Animal a = new Dog();
////        a.show();
////
////        Crocs c = new Crocs();
////        c.show();
////        c.swim();
////    }
////}