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
        System.out.println("My lucky number is " + luckyNumber);
        System.out.println("The input number is " + number);
        if (number % 10 == 0) {
            System.out.println("The number is round!");
        }
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        } else if (number % 2 > 0 || number % 2 < 0) {
            System.out.println("The number is odd!");
        }
        if (number == luckyNumber) {
            System.out.println("The input number is my lucky number!");
        }
        if (number >= 10 && number <= 100 || number <= -10 && number >= -100) {
            System.out.println("The number does have two digits!");
        }
    }
}
