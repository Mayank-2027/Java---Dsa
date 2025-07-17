package striverQues.basicmaths;
import java.util.*;
public class primeno {


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int digit= 0;
        for (int i = 1; i <=n; i ++){

            if( n%i==0){
                digit++;


            }
        }
        
        
        if (digit==2 ){
            System.out.print("True");

        }else {System.out.println("FAlse");}

    }
    
}
