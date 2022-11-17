package SACSA;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {

        // for eachs are basically for loops but enhanced iterates through all elements in an array
        // less steps and more readable
        // less flexible

//        String[] animals = {
//                "cat", "dog", "human","bird"
//        };

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Mama");
        animals.add("Mama1");
        animals.add("Mama2");
        animals.add("Mama3");
        for (String i : animals) {

            System.out.println(i);


        }


    }
}