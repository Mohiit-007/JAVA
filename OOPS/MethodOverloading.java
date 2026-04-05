package OOPS;

// same method with diff parameters and return-type 

public class MethodOverloading {
    public int add(int a,int b){
        return a + b;
    }
    public int add(int a,int b,int c){
        return a + b + c;
    }
    public void add(float a,float b){
        System.out.println(a + b);
        return;
    }
    public double add(double a,double b){
        return a;
    }


    public static void main(String[] args) {
        // main method can be overload

    }   
}
