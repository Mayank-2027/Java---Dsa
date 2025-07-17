package striverQues.basicmaths;
import java.util.*;
public class printAldivisior {
    
public  static void main (String[]args){

Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();


    for(int i =1; i <n ;i++){
          int  s = n%i;

          if ( s==0){
            System.out.print(i+",");
          }
          
         

          }
        

       
    }
       


  
}

    

