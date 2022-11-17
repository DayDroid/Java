package SACSA;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); // creates a scanner initialized with "a"
        System.out.println("Insert name for practice");


        /*
        * string variable name is declared goes to next line after your name is inputted | a.nextline() is used because a is what the scanner was initialized with
         * */
        String name = a.nextLine();
        System.out.println("How old are you?");
        Byte age = a.nextByte();
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
        a.nextLine();
        System.out.println("favorite food?");
        String food = a.nextLine();
        System.out.println("Food = " + food);
        /*
        * prints out the following without user input
        * favorite food?
        * Food =
        *  this is an issue and to fix it you would need to add
        *
        * a.nextLine();
        *
        * This will clear the scanner so you can proceed
        * */


    }
}