package Collection;
import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;

//lambda is best way to do collections sorting 

class Cricketer{
    int age;
    String name;
    double avg;
    
    public Cricketer(int age,String name,double avg){
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }
    //So default Object.toString() runs:ClassName@hashcode
    
    @Override
    public String toString() {
        return "Cricketer{" +
            "age=" + age +
            ", name='" + name + '\'' +
            ", avg=" + avg +
        '}';
    }

    // @Override
    // public int compareTo(Cricketer c){
    //     return Double.compare(this.avg, c.avg);
    // }
}


// import comparator class and use compare method in it
// class Aplha implements Comparator<Cricketer>{
//     @Override
//     public int compare(Cricketer c1,Cricketer c2){
//         // if(c1.avg < c2.avg){
//         //     return 1;
//         // }
//         // else{
//         //     return -1;
//         // }
//         return  Double.compare(c1.age, c2.age);
//     }
// }

public class DemoArraylist {
    public static void main(String[] args) {
        ArrayList<Cricketer> list = new ArrayList<>();
        Cricketer c1 = new Cricketer(15, "Vaibhave", 50.0);
        Cricketer c2 = new Cricketer(37, "Virat", 52.0);
        list.add(c1);
        list.add(c2);
        list.add(new Cricketer(39, "Rohit", 45));
        list.add(new Cricketer(32, "Hardik", 35));
        System.out.println(list); 

        // Aplha a = new Aplha();

        // Collections.sort(list,(Cricketer c3,Cricketer c4) ->
        // {
        //     // return Double.compare(c3.age, c4.age); // ascending order
        //     return Double.compare(c4.age,c3.age); // descending order
        // });
        Collections.sort(list, (c5,c6) -> Double.compare(c5.age,c6.age));
        // Collections.sort(list);
        System.out.println(list);
    }
}
