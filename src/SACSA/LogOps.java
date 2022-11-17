package SACSA;

import java.util.Scanner;

public class LogOps {
    public static void main(String[] args) {

        /*
        * Logical operators - used to connect two or more expressions
        *
        *       && (and) -- both conditions must be true
        *       || (or) -- either condition must be true
        *       != (not) -- reverses true/false value. Only for booleans cannot be applied to strings.
        *
        * */

        /*
        int t = 1;
        int f = 2;

        if(t <= 10 && f <= 10) { // and operator
            System.out.println(t + " and " + f + " are less then 10");
        }
        **/

        // press q to quit program

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quit program? (Q to quit)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("q")) { // you may also do if(response.equals("q" || "Q") { but optimization >= not optimization
            System.out.println("Program Terminated.");
            System.exit(0);
        }
            else {
                System.exit(3);
        }
        }

    }
