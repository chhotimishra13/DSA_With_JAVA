
import java.util.*;
public class SieveOfSundaram {
    public static int sieveOfSundaram(int n){
        int nNew = (n-1)/2;
        boolean marked[] = new boolean[nNew + 1];
        Arrays.fill(marked, false);
        
        for(int i=1; i<=nNew; i++){
            for(int j=1; (i+j+2*i*j)<=nNew; j++){
                marked[i+j+2*i*j] = true;

                if(n > 2){
                    System.out.print(2 + " ");
                }
            }
        }
        for(int i=1; i<=nNew; i++){
            if(marked[i] == false){
                System.out.println(2 * i+ 1+ " ");
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        sieveOfSundaram(n);
    }
}
