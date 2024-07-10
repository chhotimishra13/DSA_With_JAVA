//without making any static methods

package Function;

public class F1{
    public int add(int a, int b){
        return  a+b;
    }

    //function overriding
    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        F1 a = new F1();
        System.out.println(a.add(2,4));
        System.out.println(a.add(5.4, 7.9));
    }
    
}