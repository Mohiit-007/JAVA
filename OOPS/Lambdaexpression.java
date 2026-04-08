package OOPS;

// Lambda works only with functional interfaces (exactly ONE abstract method)

interface Alien{
    void disp();
    // void show(); We can't used this method to use lambda expression
}

interface add{
    int addition(int a,int b);
}
  
public class Lambdaexpression {
    public static void main(String[] args) {
        Alien al = new Alien() {
            public void disp(){
                System.out.println("hello from world");
            }
        };

        Alien al1 = ()->{
            System.out.println("hello from lambda1");
        };
         
        Alien al2 = ()->System.out.println("hello from lambda2");

        add ad = new add(){
            public int addition(int a,int b){
                return a + b;
            }
        };
         
        System.out.println(ad.addition(2,3));

        add a1 = (a, b) -> a + b; // it is most used expression with lambda not mention datatypes of paramter and return keyword also
        System.out.println(a1.addition(2, 4));

        add a2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(a2.addition(4, 5));

        add a3 = (int a,int b) -> a + b;
        System.out.println(a3.addition(5, 5));

        al1.disp(); 
        al2.disp(); 
        al.disp();
    }
}
