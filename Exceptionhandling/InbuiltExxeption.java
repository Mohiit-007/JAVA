package Exceptionhandling;
import java.util.Scanner;

class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }    
}

class OverAgeException extends Exception{
    public OverAgeException(String msg){
        super(msg);
    }
}

class User{
    private int age;

    public void input(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            age = sc.nextInt();
        }
    }

    public void verify() throws IllegalArgumentException
    {
        if(age >= 18 && age <= 70){
            System.out.println("You are Eligible :)");
        }
        else if(age < 18){
            throw new IllegalArgumentException("Kiddo! have some patience..");
        }
        else{
            throw new IllegalArgumentException("SIR! Rest at home");
        }
    } 
}

public class InbuiltExxeption {
    public static void main(String[] args) {
        User user = new User();
        user.input();
        user.verify();
    }
}
