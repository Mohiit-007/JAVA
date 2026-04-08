package OOPS;

interface Animal {
    void show();
}

class Dog implements Animal {
    public void show() {
        System.out.println("Dog");
    }
}

class Cat implements Animal {
    public void show() {
        System.out.println("Cat");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.show();  

        a = new Cat();
        a.show(); 
    }
}
