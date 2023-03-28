package programmeweek8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber_Prog10 {
public static void isArmstrongNumber(int num) {
    //variable declaration
    int number, temp, total = 0;
    number = num;
    while (num != 0){                                           // while loop
        temp = num % 10;
        total = total + temp * temp * temp;
        num /= 10;
    }
    if(total == number){                                        // if condition
        System.out.println( number + " - is an Armstrong number"); // print statement
    }else {
        System.out.println( number + " - is not an Armstrong number");
    }

}

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");   // User input
        int a = scanner.nextInt();
        isArmstrongNumber(a);
        //closing the scanner
        scanner.close();
    }

}
