package SACSA;

public class WrapperClasses {
    public static void main(String[] args) {

        /*
        *
        * Wrapper classes = lets you use primitive data types as a reference data type
        *
        * primitive    wrapper
        * ---------   --------
        * boolean       Boolean
        * byte          Byte
        * short         Short
        * char          Character
        * int           Integer
        * */

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes | Ex: int gets converted to Integer.
        // unboxing = the opposite of autoboxing

        /*
        *
        *  Primitive data types are a lot faster than reference data types
        *
        * */

        Boolean b = true;
        Character c = 'c';
        Integer d = 123;
        String e = "test"; // reference data type

        // reference data

        /*   Example:

                if(b==true) {
            System.out.println("B is true.");
        }


        */



        System.out.println(e);
    }
}