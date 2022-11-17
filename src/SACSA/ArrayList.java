package SACSA;


public class ArrayList {
    public static void main(String[] args) {

        /*
        *
        * Arrays are represented as a list of objects
        * Arraylists are represented as a list of objects that can be resized
        *
        * They store references data types and elements of an array can be added/removed after compilation.
        * */

        // you need to use wrapper class for arrays
        // once again strings are already reference data types
        java.util.ArrayList<String> food = new java.util.ArrayList<String>(); // array list of food objects
        food.add("apple");
        food.add("banana");
        food.add("pizza");


        // useful method
        // food.set(index, element)
        food.set(2, "sushi");
        food.remove(1);
        food.clear();

        for(int i=0;  i<food.size(); i++) { // continue the loop as long as i<food.size() | arrays use .size and not .length() | then increment index by 1
            System.out.println(food.get(i));

        }

    }
}