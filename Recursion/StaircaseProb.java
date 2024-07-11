public class StaircaseProb {
    public static int stairCase(int n){ 
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }

        else if(n == 3){
            return 4;
        }
        else{
            return stairCase(n-1) + stairCase(n-2) + stairCase(n-3);
        }
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println(stairCase(n));
    }
}
