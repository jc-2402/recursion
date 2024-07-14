//print x^n
import java.util.*;
public class Recursion9{
    public static int powxonn(int x, int n){
        //base case
        if( n == 1 ){
            return x;
        }
        // int xnm1 = powxonn(x, n-1);
        // int xn = x *xnm1;
        // return xn;

        //or
        return x * powxonn(x, n-1); //recursive call
    }
    public static void main(String[] args) {
        System.out.println(powxonn(2, 10));
    }
}