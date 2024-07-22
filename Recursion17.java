//Question 3 :Write a program to find Length of a String using Recursion.
import java.util.*;
public class Recursion17{
    public static int findstringlength(String str){
        //base case
        if(str.length() == 0){
            return 0;
        }
        //kaam
        return findstringlength(str.substring(1)) +1;

    }
    public static void main(String[] args) {
        String str = "jiya chowdhury";
        System.out.println(findstringlength(str));
    }
}

// Base Case: The method checks if the length of the input string str is 0. 
// If it is, the method returns 0, indicating that the string is empty.

// Recursive Call: If the string is not empty, the method calls itself with a new string argument, 
// which is a substring of the original string, starting from the second character (index 1) to the 
// end of the string. This is done using the substring(1) method.

// Counting: The method adds 1 to the result of the recursive call. This is because each recursive 
// call effectively removes one character from the original string, and we needto count each character.
