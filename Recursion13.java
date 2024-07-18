//friends pairing problem
import java.util.*;
public class Recursion13{
    public static int friends(int n){
        //base case
        if(n == 1 || n==2){
            return n;
        }
        //kaam
        //choice //single
        // int fnm1 = friends(n-1);
        // //pair
        // int fnm2 = friends(n-2);
        // int pairways = (n-1) * fnm2;
        // //totways
        // int totways = fnm1 + pairways;
        // return totways;

        //or
        return friends(n-1) + (n-1)*friends(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friends(3));
    }
}