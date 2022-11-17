package SACSA;

public class Arrays {
    public static void main(String[] args) {

        String car2 = "Toyota"; //standard declaration of a string


        // to make an array you would use [] and {}. for ex:
        String[] cars = {"Camaro", "Ford", "Ferrari"}; // you can decalre the string as a plural ie car --> cars
        //array of cars. they hjave elements

        cars[0] = "Mustang";
        // System.out.println(cars[1]); // accessing an element (aka camaro, ford, fer, etc) that does not exist will cause an ArrayIndexOutOfBounds exception


        /*
        * Additional way to write arrays
        * */

        String[] newArray = new String[3];
        newArray[0] = "1";
        newArray[1] = "2";
        newArray[2] = "3";
//        newArray[3] = "4";


        // you can make a for loop to display the elements of an array

        for(int i = 0; i< newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}