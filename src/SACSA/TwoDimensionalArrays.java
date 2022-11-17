package SACSA;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        // 2D array is an array of an array

        String[][] cars = new String[3][3]; //since its a 2d array you need two square brackets
        // another way of making an array is:
        String[][] cars2 = {
                {"1", "2", "3" },
                {"1", "2", "3" },
                {"1", "2", "3" }

        };

        cars[0][0] = "1";
        cars[0][1] = "2";
        cars[0][2] = "3";
        cars[1][0] = "1";
        cars[1][1] = "2";
        cars[1][2] = "3";
        cars[2][0] = "1";
        cars[2][1] = "2";
        cars[2][2] = "3";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(); // moves to next line, this is important
            for (int j = 0; j < cars[i].length; j++) { // object[i].length;
                System.out.print(cars[i][j] + " ");
            }
        }
        for (int k = 0; k < cars2.length; k++) {
            System.out.println(); // moves to next line, this is important
            for (int l = 0; l < cars[k].length; l++) { // object[i].length;
                System.out.print(cars[k][l] + " ");

            }
        }
    }
}