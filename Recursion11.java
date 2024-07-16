//tiling problem
import java.util.*;
public class Recursion11{
    public static int tiling(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //choice
        //vertical
        int f1 = tiling(n-1);
        //horizontal
        int f2 = tiling(n-2);

        int totways = f1 + f2 ;
        return totways;
    }
    public static void main(String[] args) {
        System.out.print(tiling(4));
    }
}