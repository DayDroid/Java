package SACSA;

public class VariableSwitching {
    public static void main(String[] args) {
        String x = "var1";
        String y = "var2";
        String z; //declared and not initialized
        // if x = y both x and y will produce "var2" | To switch this, you need a third variable to act as a filler in order to switch containers  ( x to z, y to x, z to y)

        z = x;
        x = y;
        y = z;

        System.out.println("x: " + x); // displays the variable x as var1
        System.out.println("y: " + y); // displays the variable y as var2

        System.out.println(x + y + z); // prints var2 , var1, var1 | x is now var 2 instead of var 1 and y is now var 1 instead of var2
    }
}