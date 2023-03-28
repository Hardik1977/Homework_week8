package programmeweek8;

import java.util.Scanner;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class DiamondPattern_Prog14 {
    public static void printDiamond(int r, char ch) {
        int i = 1;
        int j;
        while (i <= r) {                //while loop defining
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;

        while (i > 0) {
            j = 1;
            while (j++ <= r-i ) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }


    public static void main(String[] args) {            //Defining main method
        //scanner declaration
        Scanner scanner = new Scanner(System.in);       // scanner calling
        System.out.println("Enter the number of row : ");  //user input
        int a = scanner.nextInt();
        System.out.println("Enter the symbol : ");
        char c = scanner.next().charAt(0);              // value storing
        printDiamond(a, c);                                 // method calling
        //closing the scanner
        scanner.close();
    }
}
