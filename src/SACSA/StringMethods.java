package SACSA;

public class StringMethods {

    public static void main(String[] args) {

        //string stores one or more characters

        String name = "bro";

        boolean result = name.equals("bro"); // will compare two statements. Since it is a boolean, it will only print true/false. compares "bro" with "bro".
        int result1 = name.length(); //returns string name's length | 3
        int result2 = name.charAt(1); //charAt(character at location) | r
        int result3 = name.indexOf("b"); // returns the number location of a char | 0
        boolean result4 = name.isEmpty(); // returns true / false | false | because name is not empty
        String result5 = name.toUpperCase(); // BRO
        String result6 = name.toLowerCase(); // bro
        String result7 = name.trim(); // if name = "      Bro     " for ex, name.trim will set it to "Bro"
        String result8 = name.replace("b", "C"); //replaces text | Cro


        System.out.println(result8);
    }
}