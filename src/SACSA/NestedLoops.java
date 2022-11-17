package SACSA;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        /*
         *
         * A nested loop is a loop inside another loop.
         *
         * */


        // basic scanner for user input
        Scanner scanner1 = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter # of rows");
        rows = scanner1.nextInt();
        System.out.println("Enter # of columns");
        columns = scanner1.nextInt();
        System.out.println("Now choose a symbol. What symbol would you like to use?");
        symbol = scanner1.next();

        // outer loop
        for (int i = 1; i <= rows; i++) {
            System.out.println(); // moves cursor down to next row to display next chars.
            // nested loop, again this  is a for loop inside a for loop

            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }

        }
    }
}