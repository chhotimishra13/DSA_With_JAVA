public class MinimumPartitioning{
    
    public static int minPartitioning(int nums[]){
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        int W = sum/2;
        
        int dp[][] = new int[n+1][W+1];

        //bottom-up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                //valid
                if(nums[i-1] <= j){
                    //include
                    int include = nums[i-1] + dp[i-1][j-nums[i-1]];
                    //exclude
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.max(include, exclude);
                }
                //invalid
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum -  sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args){
        int nums[] = {1,6, 11, 5};

        System.out.println(minPartitioning(nums));
    }
}