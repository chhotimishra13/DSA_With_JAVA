public class JosephusProblem {
    public static int josephus(int n, int k){
        //base case
        if(n == 1 ){
            return 0;
        }
        return (josephus(n-1, k)+k) %n;

        //2nd logic
        // return (josephus(n-1, k)+k-1) %n+1;
    }
    public static void main(String[] args) {
        int n = 9;
        int k = 2;
        
        //2nd logic print
        // System.out.println(josephus(n, k));
        System.out.println(josephus(n, k)+1);
    }                                                                        
}


//time complexity = O(n)