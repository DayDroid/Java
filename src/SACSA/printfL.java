package SACSA;

public class printfL {
    public static void main(String[] args) {

        /*

        printf() = method to control, format, and display text to console

        there are 2 args-- format string + and object/varialbe/value
        % [flags] [precision] [width] [conversion-character]

        */
        System.out.printf("Test %dFormat string", 123); // use % to replace d = double at the placed position
        // Test 123Format string

        boolean bool = true;
        char character = '!';
        String str = "gaylord";
        int inter = 3;
        double d = 4.10;

        System.out.println("");
        System.out.printf("%bB is for boolean", bool);


        System.out.println("");
        //[width]
        // how many characters should be added to output?
        System.out.printf("gay and %10s 10 spaces", str);

        //[precision]
        // sets number of digits for when outputting floats
        System.out.println("");
        System.out.printf("Your available balance is: %f",d); // add .[number] to indicate count ie %.2f =  4.10 (from  4.100000)
        System.out.println("");
        System.out.printf("Your available balance is: %.2f",d);

        // [flags]
        // adds effects to output to make it more desirable
        // switch(operators) {
        // - : left (good to align numbers)
        // + : output a plus or miunus sign
        // 0 : numbers are 0 padded (adding a bunch of zer0s)
        // , : adds comma if numbers are larger than 999


    }
}