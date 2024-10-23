//using tabulation - 0(n)

public class LCS2 {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";  //ans = 3; //ace
        System.out.println(longestCommonSubsequence(str1, str2, str1.length(), str2.length()));
    }
}
