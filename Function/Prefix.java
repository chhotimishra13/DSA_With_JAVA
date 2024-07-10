package Function;

public class Prefix {
    public static int longestPrefixSuffix(String str){
        int n= str.length();
        int maxLen= 0;
        for(int len = 1; len<=n/2; len++){
            if(str.substring(0,len).equals(str.substring(n - len))){
                maxLen = len;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "smartIntsmart";

        System.out.println(longestPrefixSuffix(str));
    }
}
