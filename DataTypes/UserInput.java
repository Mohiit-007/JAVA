import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.next(); // to take a single word for input 
         sc.nextLine(); // consume leftover newline
        String sent = sc.nextLine(); // to take a complete sentence as input
        char ch = sc.next().charAt(0);

        System.out.println(num);

        // ternary
        String str = num%2 == 0 ? "Even" : "Odd";
        System.out.println(str);

    }
}
