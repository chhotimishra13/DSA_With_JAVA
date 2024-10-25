
//using tabulation -- O(n*m)
import java.util.*;
public class LongestIncreasingSubsequence{
    public static int lcs(int arr1[], int arr2[]){
        int n =  arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        //initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                dp[i][j] = 0;
            }
        }

        //bottom up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                //same
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                //different
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static int lisTab(int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        //sorted unique element store
        int arr2[] = new int[set.size()];
        int i=0;
        for(int num : set){
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr1, arr2);
    }
    public static void main(String[] args){
        int arr1[] = {50, 3, 10, 7, 40, 80};
        System.out.println(lisTab(arr1));
    }
}