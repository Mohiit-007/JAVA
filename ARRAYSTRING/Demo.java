package ARRAYSTRING;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // double[] arr = new double[5];

         for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks: ");
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        int size = arr.length; /// to calculate size
        System.out.println(size);
        for(int i=0;i<size;i++){
            System.out.println("marks: " + arr[i]);
        }

        System.out.println();

        //enhanced loop
        for(int it : arr){
            System.out.print(it + " ");
        }

        int brr[][] = new int[3][4];
        int vrr[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},  
                    };

        int count = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                brr[i][j] = count++;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

        String s = "Mohit";


    }
}