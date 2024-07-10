//print sum of n natural no.s
import java.util.*;
public class Recursion4{
    public static int sumofn(int n){
        //base case
        if(n == 1){
            return 1;
        }
        int snmin1 = sumofn(n-1); //recursive call
        int sn = n + snmin1;
        return sn;
    }
    public static void main(String[] args) {
       System.out.println( sumofn(5));
    }
}