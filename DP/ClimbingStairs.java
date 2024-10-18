//using recursion


public class ClimbingStairs {

    public static int countWays(int n){
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));
    }
}


//using memoization
// class Solution {
//     public int climbStair(int n, int memo[]) {
//         if (n == 0) {
//             return 1;
//         }
//         if (n < 0) {
//             return 0;
//         }

//         if (memo[n] != 0) {
//             return memo[n];
//         }
//         memo[n] = climbStair(n - 1, memo) + climbStair(n - 2, memo);
//         return memo[n];
//     }

//     public int climbStairs(int n) {
//         int memo[] = new int[n + 1]; 
//         return climbStair(n, memo);  
//     }
// }
