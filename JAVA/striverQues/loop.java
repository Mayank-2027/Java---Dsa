package striverQues;

public class loop {public static void main(String[] args) {
    int n = 10;
    int factorial = 1;

     for (int i = n; i > 0; i--)
     {
        factorial*=i;
     }

    System.out.println("Factorial of 5 is: " + factorial);
}
}
