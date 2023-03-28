package programmeweek8;
/**
 *. Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 *
 */

import java.util.Scanner;

public class Programme3 {

    public static void main(String[] args) {
       char ch;
        Scanner r = new Scanner(System.in);  //Scanner object creation
        System.out.println("User ask to input any letter : "); // user ask to input one letter
        ch = r.next().charAt(0);                               // Value defining
        // if condition
        if(ch =='a' || ch =='e' || ch == 'i' || ch=='o' || ch=='u' || ch=='A' || ch == 'E'||ch=='I'||ch=='O'||ch=='U' ) {
            System.out.println("The letter is Vovel");        // print statement
        }
        else {
            System.out.println("The letter is Consonant");
        }


    }
}
