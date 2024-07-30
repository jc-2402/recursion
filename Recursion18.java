// Question 4: We are given a string S,we need to find the count of all contiguous substrings starting
// and ending with the same character.
// Sample Input 1: S = "abcab"
// Sample Output 1: 7 
// There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
// Out of the above substrings,there are 7 substrings:a,abca,b,bcab,c,a and b. So,only 7 contiguous 
// substrings start and end with the same character.Sample Input 2: S = "aba"
// Sample Output 2: 4The substrings are a, b, a and aba
import java.util.*;
public class Recursion18{
    public static int countcontisubstring(String str, int i, int j, int n){
       //base case
       if(n == 1){
        return 1;
       }
       if(n <= 0){
        return 0;
       }
       //kaam
       int res = countcontisubstring(str,i+1 , j, n-1) +
                  countcontisubstring(str, i, j-1, n-1) -
                  countcontisubstring(str, i+1, j-1, n-2);
       if(str.charAt(i) == str.charAt(j)){
        res++;
       }
       return res;
    }
    public static void main(String[] args) {
        String str = "aba";
        int n = str.length();
        System.out.print(countcontisubstring(str, 0, n-1, n));
    }
}

public class Main {
    public static int countSameCharSubstrings(String s) {
        return countSameCharSubstrings(s, 0, 0);
    }

    private static int countSameCharSubstrings(String s, int i, int count) {
        if (i >= s.length()) {
            return count;
        }
        for (int j = i; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
            }
        }
        return countSameCharSubstrings(s, i + 1, count);
    }

    public static void main(String[] args) {
        System.out.println(countSameCharSubstrings("abcab"));  // Output: 7
        System.out.println(countSameCharSubstrings("aba"));  // Output: 4
    }
}