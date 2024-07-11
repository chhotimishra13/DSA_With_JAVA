import java.util.Scanner;

public class Fact{
    public static int factorial(int n){
        //base case
        if(n == 0){
            return 1;
        }
        else{
            return factorial(n-1) * n;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
    }
}

//time complexity = 0(n!)