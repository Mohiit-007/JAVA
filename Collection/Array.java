package Collection;
import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        // from Java 10, you can use the var keyword to declare an ArrayList
        //  variable without writing the type twice. The compiler figures out the type from the value you assign.
        // var cars = new ArrayList<String>();
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        int data = arr[1];
        System.out.println(data);

        String str[] = new String[2];
        str[0] = "mohit";
        str[1] = "rohit";

        ArrayList<String> courses = new ArrayList<>();
        courses.add("mohit");
        courses.add("rohit");
        courses.add("purohit");
        courses.add("mohit");
        System.out.println(courses);

        String s1 = (String) courses.get(0);
        String s2 = courses.get(1);
        String s3 = courses.get(2);

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.toUpperCase());


        Collections.shuffle(courses);
        int info = Collections.frequency(courses, "mohit");
        Collections.sort(courses);
        System.out.println(courses);
        System.out.println(info);
         
    }
}
