package striverQues.pattern;

public class pattern2 {
    public static void main(String []args){
        Printpattern1(5);
      
          }
          
          static void Printpattern1(int n ){
      
              for (int row = 1; row <= 2*n-1; row++){
               int totalcol = row > n ? 2 *n - row : row;

               
            
              
               for (int space=0; space < n -totalcol; space++){
                System.out.print("  ");
             
         }


         for (int col=totalcol; col >=1; col--){
                        
                       
            System.out.print(col+ " " );
         
     }

                   
         for (int col=2; col <=totalcol; col++){
                        
                       
            System.out.print(col+ " " );
         
     }
                 
                System.out.println();
                }
            }
                   
}
                  
                 
                 
                 
                 
              
             
          
          
  