import java.util.*;

public class PriorityQueuejcf{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(5);    //O(logn)
        pq.add(4);
        pq.add(6);
        pq.add(9);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());   //O(1)
            pq.remove();  //O(logn)
        }
    }
}