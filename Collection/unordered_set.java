package Collection;
import java.util.LinkedHashSet;

// linkedhashset is child class of hash set
// the diff is linkedhashset Maintains insertion order while hashset do not maintain it

public class unordered_set {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(10); 
        st.add(10); 
        st.add(10); 
        st.add(20); 
        st.add(40); 
        st.add(35); 
        st.add(15);
        st.remove(10);

        st.add(null);
    
        System.out.println(st); 
    }
}
