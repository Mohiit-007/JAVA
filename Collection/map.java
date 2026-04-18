package Collection;
import java.util.Map;
import java.util.TreeMap;
import java.lang.classfile.constantpool.IntegerEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

// HashMap ❌ → No order
// LinkedHashMap ✅ → Maintains insertion order

public class map {
    public static void main(String[] args) {
        //<Integer,String> is generics 
        // Generics are used to make code work with specific types while still being reusable for different types

        Map<Integer,String> mp = new LinkedHashMap<>(); // we use this more for loose coupling
        // HashMap<Integer,String> mp = new HashMap<>();
        // Map<Integer,String> mp = new HashMap<>();

        mp.put(3,"Mohit");
        mp.put(4,"Rohit");
        mp.put(1,"Purohit");
        mp.put(2,"tohit");
        System.out.println(mp);

        Map<Integer,String> map = new TreeMap<>();
        map.put(2,"Mohit");
        map.put(1,"Rohit");
        map.put(4,"Purohit");
        map.put(3,"tohit");
        System.out.println(map);

        Hashtable<Integer,String> hashtable  = new Hashtable<>();
        hashtable.put(1,"mohit");

        Set<Integer> st = map.keySet();
        // ListIterator<Integer> it = st.listIterator(); it does not work with set
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // List<String> list = map.values(); // map.vales() reutrns a collection
        Collection<String> list = map.values();
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 

        Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<Integer,String> pair = iter.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        map.forEach((key,value) -> System.out.print(key + "->" + value + " "));
    }
}
