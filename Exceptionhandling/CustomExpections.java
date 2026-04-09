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

    public void verify() throws UnderAgeException , OverAgeException
    {
        if(age >= 18 && age <= 70){
            System.out.println("You are Eligible :)");
        }
        else if(age < 18){
            throw new UnderAgeException("Kiddo! have some patience..");
        }
        else{
            throw new OverAgeException("SIR! Rest at home");
        }
    } 
}

class RTO {
    public void initiate(){
        User user = new User(); 
        try {
            user.input(); 
            user.verify();
        } catch (UnderAgeException | OverAgeException e1) {
            System.out.println(e1.getMessage());
            try { 
                user.input();
                user.verify();
            } catch (UnderAgeException | OverAgeException e2) {
            System.out.println(e2.getMessage());
            try { 
                user.input();
                user.verify();
            } catch (UnderAgeException | OverAgeException e3 ) {
                System.out.println("U are Blocked");
            }
        }
    }
  }
}

public class CustomExpections {
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.initiate();
    }
}
