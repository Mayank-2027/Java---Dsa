package Basicofjava;
 import java.util.*;

public class variablesum {

    public static void main(String[]args){

String name = "Mayank Chandravanshi" ;

int age = 21;
System.out.println(age);
 System.out.println(name.length());

        int a,b,c,d;

        a = 2;
        b = 3; 
        c = 4;
        d = a+b*c;

        System.out.println(d);        

    if ( d == 9) {
        System.out.println("yes");

    }
    else {
        System.out.println("No");
    }
  
    Scanner sc = new Scanner(System.in);

    int agge = sc.nextInt();
    System.out.print("Enter your age  :");
  
    System.out.println(agge);

     
   
    }
}
