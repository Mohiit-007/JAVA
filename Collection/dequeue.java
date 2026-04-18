package Collection;
import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(100);
        dq.add(200);
        dq.add(300);
        System.out.println(dq);
        dq.add(400);
        dq.add(500);
        dq.addFirst(600);
        dq.addLast(30);
        System.out.println(dq);

        //remove from front
        // dq.remove();
        // dq.removeFirst();
        // dq.poll();        // safer
        // dq.pollFirst();

        //remove from rear
        // dq.removeLast();
        // dq.pollLast();

        // Get first element
        // dq.getFirst();
        // dq.peek();
        // dq.peekFirst();

        // Get last element
        // dq.getLast();
        // dq.peekLast();

        // dq.size();        // number of elements
        // dq.isEmpty();     // check empty
        // dq.clear();       // remove all elements

        System.out.println(dq.pollLast());
        // dq.add("mohit"); // it can also add string if we don't specify Integer above but it's bad prac tice
        System.out.println(dq.peek());
        System.out.println(dq);
    }
}
