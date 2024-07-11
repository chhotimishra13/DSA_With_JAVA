import java.util.Scanner;

public class Fibo {
    public static int fib(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();

        System.out.println(fib(n));
    }
} 
