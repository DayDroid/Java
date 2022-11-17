package SACSA;

public class MathematicalExpressions {
    public static void main(String[] args) {

        /*
        *  Expressions are a combination of operands and operators
        *
        * examples of operands : values, variables, or quanitites
        * examples of operators : / * + % etc
        * */

        /*
        * modulus reminder: gives remainder of a division 10%2 = 0 because 10 divides into 2 cleanly (no remainder)
         */
        int num = 10;
        int num2 = 10;
        double num3 = 10;
        // num = num + 1; | long way of doing this. To increment by 1, use ++ ex:
        num++;
        // to decrement, use i-- ex:
        num2--;

        num3 = (double)num3 / 3; //doing this will produce 1.3333 (shown as 1 in the compiler output). | To fix this, cast the result as a double / float so that it is properly shown.
        //as double is used to initialize the variable num3, you must use (double). (int) or any other casts will not work.


        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);

    }
}