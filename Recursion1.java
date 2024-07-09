//print no. from 1 to n in dec order
import java.util.*;
public  class  Recursion1{
    public static void printdec(int n){
        //base case
        if(n==1){
            System.out.print(n);
            return; // terminate
        }
        System.out.print( n +" ");
        printdec(n-1); //recursive call 
    }
    public static void main(String[] args) {
        printdec(10);
    }
}