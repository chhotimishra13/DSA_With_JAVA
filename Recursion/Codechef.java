import java.util.Scanner;

public class Codechef {
    public static boolean isPoss(int n){
        int even = 0, odd = 0;
        for(int i=1; i<=n; i++ ){
            if(n % i == 0){
                if( i % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        if(even == odd){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while(n-- >0){
            int a = s.nextInt();
            if(isPoss(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
