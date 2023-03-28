package programmeweek8;

import java.util.Scanner;

public class FibonacciNumber_Prog9 {
    public static void isFibonacci(int count){
        int n1 = 0, n2 = 1; int n3;
        System.out.println(n1 + "" + n2);   // print statement
        //loop starts from 2 because o and 1 are already printed
        for (int i = 2; i< count; ++i) {   // loop declaration
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Fibonacci number count : ");
        isFibonacci(scanner.nextInt());
        //scanner closing to occupy memory
        scanner.close();
    }


}
