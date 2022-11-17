package SACSA;


import java.util.ArrayList;

        /*

        2D Array lists are a list of separate lists
        their size are changeable during runtime.

        requires the
        java.util.*; import


         */

public class TwoDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> concatAll = new ArrayList<>(); // creates an array of arrays called concatAll.


        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Sugar");
        bakeryList.add("Bread");
        bakeryList.add("Flour");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Carrot");
        produceList.add("Apple");
        produceList.add("Broccoli");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Pepsi");
        drinksList.add("Coke");
        drinksList.add("AppleJuice");


        concatAll.add(bakeryList); // to concatenate all the arrays
        concatAll.add(produceList);
        concatAll.add(drinksList);


       // System.out.println(bakeryList.get(2)); // prints "flour"
        System.out.println(bakeryList);
        System.out.println(produceList);
        System.out.println(drinksList);




        System.out.println(concatAll);
        System.out.println(concatAll.get(0)); // .get(arrayindex) grabs the index of arrays | [Sugar, Bread, Flour]
        System.out.println(concatAll.get(0).get(0)); // basically a branch; gets first index, then the first index of the first index | Sugar

    }
}