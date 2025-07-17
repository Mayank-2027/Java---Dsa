package striverQues.basicmaths;
import java.util.*;
public class palidrome {


    public static boolean isPalindrome(int n) {
     int o = n;

int rev = 0;
while (n>0){
    int d = n % 10;
   
     n = n/10;
    rev = rev *10 + d;
  }
    return o==rev;
} 


public static void main ( String[]args){
    

   System.out.println(isPalindrome(131)); 
}
    }

    

