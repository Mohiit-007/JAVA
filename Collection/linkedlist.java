package Collection;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(30);
        ll.add(null);
        ll.add(1,96);
        // System.out.println(ll.reversed());
        ll.remove(Integer.valueOf(20));
        ll.remove(3);
        System.out.print(ll);
        
    }
}
