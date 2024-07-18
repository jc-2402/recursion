//remove duplicates in a string
import java.util.*;
public class Recursion12{
    public static void removedupl(String str, int idx, StringBuilder newstr, boolean map[]){
        //base
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){ // true mtlb 1st time mil gaya
            // then duplicate
            removedupl(str, idx+1, newstr, map);
        }else{ //not duplicate
            map[ currchar - 'a'] = true;//mtlb ek bar already aa gya h.. so now add
            removedupl(str, idx+1, newstr.append(currchar), map); // add this to newstr string to get all duplicates
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removedupl(str,0, new StringBuilder(""), new boolean [26]);
    }
}