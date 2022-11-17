package SACSA;

public class BasicVariables {
    public static void main(String[] args) {
        int b; // declaration of a variable
        short c = 32767; // initialization of a variable
        short d = (short) 32768; // to pass signed short limit you would need to cast
        char e = 'u';
        double f = 4.492348293489239; // for precision | stores up to 15 numbers after the decimal point
        boolean g = true; // stores only true or false
        System.out.println(f);

        /*
         * Simple @gmail.com added from Username
         * */
        final char at = '@';
        final String gmail = "gmail.com";
        System.out.println("username" + at + gmail);
    }
}