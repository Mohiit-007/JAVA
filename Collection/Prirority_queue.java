package Collection;
import java.util.PriorityQueue;

public class Prirority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //default :- min-heap
        
        pq.add(100); //add :- tp insert an element
        pq.add(50);
        pq.add(25);
        pq.add(75);
        pq.add(40);
        pq.add(150);

        pq.offer(200); //offer :- not neccesary to add
        System.out.println(pq.peek()); // peek :- use to access top element
        while(pq.isEmpty()){
            System.out.println(pq.poll() + " "); //poll - delete top element and return it
        }
        System.out.println(pq);
    }
}
