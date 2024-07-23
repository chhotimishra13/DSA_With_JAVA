package Stack;

import java.util.Stack;

public class P1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("After pussing elements is  : "+s);
        s.pop();
        System.out.println("After pop operation the elemets is: "+s);
    }
}
