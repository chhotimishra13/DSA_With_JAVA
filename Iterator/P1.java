package Iterator;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(10);
        n.add(20);
        n.add(30);

        Iterator<Integer> it = n.iterator();

        //for printing all element
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // System.out.println(it.next());//for 1st element

    }
}
