// Question 2 :You are given a number (eg -  2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE-The digits of the number will only be in the range 0-9 and the lastdigit of a number can’t be 0.
// Sample Input: 1947
// Sample Output: “one nine four seven”
import java.util.*;
public class Recursion16{
    public static void englishnums(int num){
        //base case
        if(num == 0){
           return;
        }
        //kaam
        int lastdigit = num% 10;
        englishnums(num/10);
        switch(lastdigit){
            case 1 : System.out.print("one"+" ");
            break;
            case 2 : System.out.print("two ");
            break;
            case 3 : System.out.print("three ");
            break;
            case 4 : System.out.print("four ");
            break;
            case 5 : System.out.print("five ");
            break;
            case 6 : System.out.print("six ");
            break;
            case 7 : System.out.print("seven ");
            break;
            case 8 : System.out.print("eight ");
            break;
            case 9 : System.out.print("nine ");
            break;
        }
    }
    public static void main(String[] args) {
        int num = 1947;
        englishnums(num);
    }
}