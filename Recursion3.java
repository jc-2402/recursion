//print factorial
import java.util.*;
public class Recursion3{
    public static int factorial(int n){
        //base case
        if(n ==0){
            return 1; // 0! = 1
        }
        int fnmin1 = factorial(n-1);// factorial of n -1
        int fn = n * factorial(n-1); // f(n) = n * f(n-1) 
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}