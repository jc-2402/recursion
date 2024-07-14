//wap to find last occurance of an element of an element in an array
import java.util.*;
public class Recursion8{
    public static int lastoccurance(int arr[], int key, int i){
        //base case
        if( i == arr.length){
            return -1;
        }
        int isfound =  lastoccurance(arr, key, i+1); //recursive call

        if(arr[i] == key && isfound == -1){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] ={8,3,6,9,5,10,2,5,3};
        int key =5;
        System.out.println("key last occured at index "+lastoccurance(arr, key, 0));
    }
}