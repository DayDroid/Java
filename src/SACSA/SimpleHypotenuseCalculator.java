package SACSA;

import java.util.Scanner;

public class SimpleHypotenuseCalculator {
    public static void main(String[] args) {

/*        double x = 3.14;
        double y = -10;
        double z = 10;

        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(z));*/

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter side y: ");
        b = scanner.nextDouble();

         c = Math.sqrt((a*a)+(b+b)); // generates the hypotenuse (sqrt a^2 + b^2 = c)
        System.out.println("Hypotenuse is " + c);


    }
}