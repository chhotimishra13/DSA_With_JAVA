//using recursion

public class LongestCommonSubsequence{
    
    public static int longestCommonSubsequence(String str1, String str2, int n, int m){
        //base case
        if(n == 0 || m == 0){
            return 0;
        }

        //for same
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return longestCommonSubsequence(str1, str2, n-1, m-1) + 1;
        }
        //diff
        else{
            int ans1 = longestCommonSubsequence(str1, str2, n-1, m);
            int ans2 = longestCommonSubsequence(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";  //ans = 3; //ace
        System.out.println(longestCommonSubsequence(str1, str2, str1.length(), str2.length()));
    }
}