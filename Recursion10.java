//print x^n in optimized
import java.util.*;
public class Recursion10{
    public static int optpowxonn(int x, int n){
        //base case
        if(n == 0){
            return 1;
        }
        //even
        int halfpower = optpowxonn(x, n/2);
        int halfpowerset = halfpower * halfpower;
        //odd
        if(n % 2 != 0){
            halfpowerset = x * halfpowerset;
        }
        return halfpowerset;
    }
    public static void main(String[] args) {
        System.out.println(optpowxonn(2, 5));
    }
}