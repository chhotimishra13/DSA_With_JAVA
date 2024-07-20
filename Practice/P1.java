package Practice;

import java.util.Scanner;

public class P1 {
    public static int apple(int n, int k){
        return k%n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println(apple(n, k));
    }
}
