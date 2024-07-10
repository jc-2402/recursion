//check if a array is sorted or not
import java.util.*;
public class Recursion6{
    public static boolean  issorted(int arr[], int i){
        //base case
        if( i== arr.length-1){
            return  true;
        }
        if( arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,4,2,3};
        System.out.print(issorted(arr, 0));
    }
}