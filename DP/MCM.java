public class MCM{

    //using recursion
    public static int mcmRec(int arr[], int i, int j){
        //base case
        //for single matrix case
        if(i == j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<=j-1; k++){
            int cost1 = mcmRec(arr, i, k);    //Ai.......Ak => arr[i-1] * arr[k]
            int cost2 = mcmRec(arr, k+1, j) ;  //Ak+1.......Aj => arr[k] * arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int final_cost = cost1 + cost2 + cost3;
            ans =  Math.min(ans, final_cost);
        }
        return ans;
    }

    //using memoization - O(n^2)
    public static int mcmMemoization(int arr[], int i, int j, int dp[][]){
        //base case
        if(i == j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int mincost = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mcmMemoization(arr, i, k, dp);
            int cost2 = mcmMemoization(arr, k + 1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int final_cost = cost1 + cost2 + cost3;
            mincost = Math.min(mincost, final_cost);
        }
        print(dp);
        return dp[i][j] = mincost;

    }
    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,3};
        int n =  arr.length;

        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(mcmMemoization(arr, 1, n-1, dp));
        //System.out.println(mcmRec(arr, 1, n-1));
    }
}