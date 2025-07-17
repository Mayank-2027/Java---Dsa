package striverQues.basicmaths;

public class reverse {
  
      public static int reverse(int n ){

        
           int rev = 0;
           for(int i = 0;i <=n ; i++){

            int  s = n%10;
          
            rev = rev * 10 + s;
             n = n/10;
             
       }
             return rev;     
       }

           public static void main (String[]args){

            System.out.println(reverse(34436656));
      }
    
    }








    