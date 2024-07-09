//print no. from  n to 1 in inc order
import java.util.*;
public  class  Recursion2{
    public static void printinc(int n){
        //base case
        if(n == 1){
            System.out.print(n+" ");
            return; // terminate
        }
        printinc(n-1); //recursive call 
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printinc(10);
    }
}