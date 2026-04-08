package OOPS;

// Loose coupling is achieved using interfaces, abstraction, and dependency injection,
//  where classes depend on behavior rather than implementation

interface Engine {
    void start();
}

class PetrolEngine implements Engine{
    public void start(){
        System.out.println("Petrol Engine started");
    }
}

class ElectricEngine implements Engine{
    public void start(){
        System.out.println("Electric Engine started");
    }
}

class Car{
    Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class looseCoupling{
    public static void main(String[] args){
        Engine e1 = new PetrolEngine();
        Car c1 = new Car(e1);
        c1.drive();

        Engine e2 = new ElectricEngine();
        Car c2 = new Car(e2);
        c2.drive();

    }
}