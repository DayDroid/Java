package SACSA;

import java.util.Random;

public class PseudoRandomRNG {
    public static void main(String[] args) {

        Random a = new Random(); //pseudorandom because its created by int | Signed int limit: -2147483648 to 2147483647
        int a1 = a.nextInt(5)+1; // to limit size, place numbers within parenthesis. 6 generates between 0 and 5 | To remove this, add a "+1" at the end of the ()
        // double y = random.nextDouble(); // generates a random number between 1 and 0
        boolean z = a.nextBoolean();
        System.out.println(z); // randomly generates true or false


    }
}