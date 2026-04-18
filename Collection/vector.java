package Collection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class vector {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(50);
        al.add(30);
        al.add(20);
        al.add(null);
        al.add(1,22);
        System.out.println(al);
        al.removeLast();
        al.removeFirst();
        System.out.println(al);
        ArrayList<String> as = new ArrayList<>();
        as.add("mohit"); 
        as.add("rohit"); 
        as.add("purohit"); 
        as.add("tokito"); 
        as.add("Shenobi");
        //“Since String is a subclass of Object, elements of ArrayList<String> can be treated as Object due to upcasting,
        //  but specific methods require downcasting.”
        String str = as.get(3);
        System.out.println(str);
        for(int i=0;i<as.size();i++){
            System.out.print(as.get(i) + " ");
        }
        System.out.println();
        for(String i : as){
            System.out.print(i + " ");
        }
        System.out.println();

        //best pratice to go with iterator for access element of list
        //ListIterator := move forward + backward and support modification
        //Iterator :- only move forward and do notsupport modification

        ListIterator<String> it = as.listIterator();
        while(it.hasNext()){
            Object o = it.next(); // Returns the current element Moves the iterator to the next position
            // Object o1 =  it.previous();
            System.out.print(o + " ");
            it.add("tokyo");
        }
        System.out.println(as);

        //Modify → creates new copy by CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("mohit");
        list.add("rohit");
        list.add("purohit");

        for(String s : list){
            System.out.print(s + " ");
            list.add("tokyo"); // ✅ NO exception
        }

        System.out.println();
        System.out.println(list);

        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(al);

        ListIterator<Integer> lit = a.listIterator(5);
        while(lit.hasPrevious()){
            System.out.print(lit.previous() + " ");
        }

        System.out.println();
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        ListIterator<Integer> itr = v.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        Enumeration<Integer> enu = v.elements();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
        System.out.println(v);
    }
}
