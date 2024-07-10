package Function;

public class SmallestNumber {
    public static int smallest(int a, int b, int c){
        if(a <= b && a <= c){
            return a; 
        }
        else if(b<=a && b<=c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        int a = 200;
        int b = 3;
        int c = 29;
        System.out.println(smallest(a, b, c));
    }
}
