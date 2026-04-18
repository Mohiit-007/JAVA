package Collection;
import java.util.HashMap;

public class unordered_map {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(3,4); 
        mp.put(5,6); 
        mp.put(1,2); 
        mp.put(4,2);
        System.out.print(mp); 
    }
}
