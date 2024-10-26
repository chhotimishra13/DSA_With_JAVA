//using recursion

public class CatalanNumber1 {

    public static int catalannumber(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;
        for(int i = 0; i<=n-1; i++){
            ans = ans + catalannumber(i) * catalannumber(n - i - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(catalannumber(n));
    }
}
