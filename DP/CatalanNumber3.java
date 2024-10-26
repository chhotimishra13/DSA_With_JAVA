//using tabulation - O(n^2)

public class CatalanNumber3 {

    public static int catalanTab(int n){
        int dp[] = new int[n+1];

        //initialization
        dp[0]  = 1;
        dp[1] = 1;

        //fill - bottom up
        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1]; //Ci = Cj * Ci-j-1
            }
        }
        print(dp);
        return dp[n];
    }
    public static void print(int dp[]){
        for(int i=0; i<dp.length; i++){
            System.out.print(dp[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(catalanTab(4));
    }
}
