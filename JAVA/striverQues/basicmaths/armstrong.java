package striverQues.basicmaths;
import java.util.*;
public class armstrong {

     public static void  main (String []args){
  
        Scanner sc= new Scanner(System.in);
     int r,sum=0;
        int n = sc.nextInt();
int o= n;
        while(n>0){
           r = n%10;
           n=n/10;
            sum=sum+r*r*r;

            
        }
         if(o==sum)
         {
            System.out.println("true");

        }else{ System.out.println("false");}
        
        
     }

}
