package Basicofjava.basicofarray;
import java.util.*;
public class leetcode {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array :");
int size = sc.nextInt();

int []B = new int[size];

for (int i=0; i<size;i++){
    B[i]=sc.nextInt();
}
    


System.out.println("Enter first no. :");
int x= sc.nextInt();

System.out.println("Enter second no. :");
int y= sc.nextInt();


int sum = B[x]+B[y];

System.out.println(sum);
}
}