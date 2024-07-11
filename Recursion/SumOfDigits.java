import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n){
        if( n == 0){
            return 0;
        }
        else{

            return (n%10 + sumOfDigits(n/10));
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
