//tabulation 
import java.util.Scanner;

public class FiboDP {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            int arr[] = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            for(int i=2; i<=n; i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
            return arr[n];
        }
    }
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
