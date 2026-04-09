package ARRAYSTRING;
import java.util.Arrays;


public class Demo2 {
    public static void main(String[] args) {
        double[] arr = new double[5];

        int a[] = {1,2,3,4,5,6,7,8,9};
        for(int it : a){
            System.out.print(it + " ");
        }
        System.out.println();

        
        // Binary search
        int d = Arrays.binarySearch(a, 11);
        System.out.println(d);
    }
}