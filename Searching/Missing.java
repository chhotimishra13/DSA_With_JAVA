
import java.util.*;


public class Missing {
    public static void main(String[] args) {
        Scanner s  =  new Scanner(System.in);

        int n =  s.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int m =  s.nextInt();
        int brr[] = new int[m];
        for (int i=0; i<m; i++) {
            brr[i] = s.nextInt();
        }
        HashMap<Integer,Integer> bSet = new HashMap<Integer, Integer>();
        for(int i=0; i<m; i++){
            if(bSet.containsKey(brr[i])){
                bSet.put(brr[i],bSet.get(brr[i] )+1);
            }
            else{
                bSet.put(brr[i], 1);
            }
        }

        for(int i=0; i<n; i++){
            if(bSet.containsKey(arr[i])){
                bSet.put(arr[i],bSet.get(arr[i]) - 1);
            }
        }
        for(Map.Entry<Integer,Integer> val:bSet.entrySet()){
            if(val.getValue() > 0){
                System.out.print(val.getKey() +" ");
            }
        } 
    }
}
