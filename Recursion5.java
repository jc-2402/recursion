//print nth fibonacci no.
import java.util.*;
public class Recursion5{
    public static int fib(int n){
        //basecase
        if(n == 0|| n ==1){
            return n;
        }
        int fnmin1 = fib(n-1);
        int fnmin2 = fib(n-2);
        int fn = fnmin1 + fnmin2;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fib(24));
    }
}