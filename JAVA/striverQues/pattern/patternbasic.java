package striverQues.pattern;

public class patternbasic {
    public static void main(String []args){
  Printpattern1(5);

    }
    
    static void Printpattern1(int n ){

        for (int row = 1; row <=n; row++){

            for (int col =1 ; col <=row; col++){
                System.out.print("*   ");
            }

           
          System.out.println();
        }
    }
}
