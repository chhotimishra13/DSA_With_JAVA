//using memoization - 0(n*m)

public class CatalanNumber2 {
    public static int catalanMemo(int n, int dp[]){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        int ans = 0;
        for(int i=0; i<=n-1; i++){
            ans += catalanMemo(i, dp) * catalanMemo(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }
        System.out.println(catalanMemo(n, dp));
    }
}
