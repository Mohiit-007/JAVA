import java.util.Scanner;

public class Controlflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // if-else statement
        if(age > 18){
            System.out.println("Vote..");
        }
        else{
            System.out.println("Can't Vote");
        }

        // if - else-if - else
        if(age > 18){
            System.out.println("Vote..");
        }
        else if(age == 18){
            System.out.println("Wait for 1 More B'day to Vote");
        }
        else{
            System.out.println("Can't Vote");
        }    
    }   
}
