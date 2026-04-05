package OOPS;

//whenever a single constructor is called and all constrctor called of parent and child then it is known
// as constructor chaining

// super keyword is used to access parent constuctor and variables
// this keyword is used to access constructor and varibales of same class 

// super :- diff. class
// this :- same class

class Parent{
    int age = 11;

    Parent(){
        this(3,4);
        System.out.println("Parent default constructor is called");
    }
    Parent(int a,int b){
        System.out.println("Parent Parameterized constructor is called");
    }
    
    void display(){
        System.out.println(age);
    }
}

class Child extends Parent{
    int age = 10;

    Child(){
        // super(); default parent constructor is called 
        this(10,23); // parameterized this constructor
        System.out.println("Child default constructor is called");
    }
    Child(int a,int b){
        // super(10,20); // parameterized super constructor
        System.out.println("Child Parameterized constructor is called");
    }
    
    void display(){
        //super.age - it will access the parent class age var
        age = 14;
        System.out.println(this.age); // current class age
        System.out.println(super.age); // another class age
    }

    void show(){
        display(); // same class display method called
        super.display(); // parnt class display method called
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();

    }
}
