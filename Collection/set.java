package Collection;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

// it stores unique and sorted data in set

public class set {
    public static void main(String[] args) {
        // TreeSet<Integer> st = new TreeSet<>(); // it is a ordered set 
        // Set<Integer> st = new TreeSet<>(); // it is a ordered set    
        NavigableSet<Integer> st = new TreeSet<>(); // it is a ordered set   
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);
        st.add(80);
        st.add(100);
        st.add(100);
        st.add(120);
        st.remove(30);
        st.removeFirst();
        System.out.println(st);
        System.out.println(st.higher(50));
        System.out.println(st.lower(40));
        System.out.println(st.floor(50));
        System.out.println(st.ceiling(30));
        System.out.println(st.headSet(50));
        System.out.println(st.tailSet(50));
    }
}