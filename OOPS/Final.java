package OOPS;

// Note : abstract and final cannot be used at once -- > it is illegal combination

// 1. final class cannot be inherited (we cannot inherited from final class)
// 2. final methods can be inherited however we cannot override them
// 3. final variable cannot be re iniatialized (nehave as constant)
// 4. class , method ans variable can be final

final class Animal{
    final Double PI = 3.14283;
    public void walk(){
        System.out.println("Animal can walk");
    }
    public void food(){
        System.out.println("Animal eats food");
    }
}

// class Dog extends Animal{
//     public void type(){       
//         System.out.println("Type of Animal is Dog");
//     }

//     public void food(){
//         System.out.println("Dogs like meat");
//     }
// }

public class Final {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.PI);
    }
}
