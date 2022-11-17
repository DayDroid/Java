package SACSA.OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        / Constructing a car object
        */
        Car car = new Car(); // Class | variableName | = | new instance of | class object | to instantianize this, you do Car car = new Car();
        Car car2 = new Car();

        Scanner scanner = new Scanner(System.in);


//        System.out.println(car.model); // . to display attribute | prints corvette
//        System.out.println(car.make); // chevvy
//        car.Drive(); // runs Drive method. Drives 1 meter.


        System.out.println("Select an option.");
        System.out.println(">> Drive");
        System.out.println(">> Stop");
        String scanner1 = String.valueOf(scanner.next());
        System.out.println(scanner1);
        if(scanner1.equalsIgnoreCase("drive")) {
            car.Drive();
        }
        if(scanner1.equalsIgnoreCase("stop")) {
            car.Brake();
        }
        else {
            System.out.println("You must select an option.");
            System.out.println(">> Drive");
            System.out.println(">> Stop");
        }

    }
}