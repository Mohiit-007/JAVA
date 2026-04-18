package Collection;

class Animal{
    void sound(){
        System.out.println("hoooo...");
    }
}

class Dog extends Animal{
    @Override // Now using annotaion compiler will also know about this method has overiden
    void sound(){
        System.out.println("Xoooo...");
    }
}

public class Annotations {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
