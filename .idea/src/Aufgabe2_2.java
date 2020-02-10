/*
Assignment and logical operators
Aufgabe 2.2 Characteristics of a number
Write a program that reads a number from the console and calculates and prints characteristics of it:
is the number round
is the number even
does the number equal your lucky number (choose any lucky number for this and print it to the console at the start of the program)
does it have two digits
Hint: You might find the modulo operation helpful for the first two exercises.
 */

import java.util.Scanner;

public class Aufgabe2_2 {
    public static void main(String[] args) {
        int luckyNumber = 3;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("my lucky number is " +number);
        System.out.println("number" + number);
        if(number%2 > 0){
            System.out.println("the number is odd");
        }
        else{
            System.out.println("the number is even");
        }

        if(number == luckyNumber){
            System.out.println();
        }
        if(number >=10){
            System.out.println("the number does have two digits");
        }
    }
}
