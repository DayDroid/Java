package SACSA;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        // while loop | executes code if code is true
        Scanner scanner = new Scanner(System.in);
        String name = "";

/* basic while loop


    while(name.isEmpty()) {
        System.out.println("Enter Username: " + name);
        name = scanner.nextLine();
    }
*/

        do {
            System.out.println("This is a do loop.");
            name = scanner.nextLine();
        } while (name.isEmpty());


    System.out.println("Hello, " + name);
    }
}