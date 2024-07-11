import java.util.Scanner;

public class SieveOfEratoshenes {

    public static void sieveOfEratoshenes(int n){
        boolean prime[] = new boolean[n+1];

        for(int i=0; i<=n; i++){
            prime[i] = true;
        }

        for(int p=2; p*p<=n; p++){
            if(prime[p] == true){
                for(int i=p * p; i<=n; i+=p){
                    prime[i] = false;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(prime[i] == true){
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sieveOfEratoshenes(n);
    }
}


//time complexity = O()