
package Basicofjava.basicofarray;
import java.util.*;
public class printarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       
       
        System.out.println("Enter the size of array :");

        int size = sc.nextInt();
        
        //input
        int [] A = new int [size];
        
        int m = 43;
        for (int i =0; i<A.length; i++){
            A [i]=sc.nextInt();

        }
      // output
        for( int i= 0 ;i<size ;i ++){
            System.out.print(A[i] +" ");
        } 
        
    }
    
}
