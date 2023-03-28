package programmeweek8;

import java.util.Scanner;

public class PrimeNumber_Prog12 {

    public static void isPrimeNumber(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number. ");
        } else {
            System.out.println(num + " is not a prime number. ");
        }
    }
        public static void main (String[] args) {
            // scanner declaration
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter any number : ");
            int a = scanner.nextInt();
            isPrimeNumber(a);
            //closing scanner
            scanner.close();
        }

    }



