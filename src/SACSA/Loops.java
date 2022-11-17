package SACSA;

public class Loops {
    public static void main(String[] args) {
         /* for loop = executes code a limited amount of time
         *  while loop = infnintely executes code as long as its true
         * */

        // inside the parenthesis for for(), you add your condition
        for(int index = 0; index<=50; index++) { // you can declare index/counter
            // essentially its, for(counter/index/i; condition; increment/decrement said index)
            //index can be shortened to i
//            System.out.println(index);
        }
            for(int i = 10; i >= 0; i--) { // for loop to decrement from 10 to 0
//                System.out.println(i + " Decrementing");
            }

            for(int e = 10; e >= 0; e-= 2) { // for loop to decrement from 10 to 0 by 2 each time
            System.out.println(e + " Decrementing By 2");

            /*
            *
            *  You can also move the third argument from for(1,2,3) after sysout. But this is optional
            *
            * ex:
            *
            *   for(int index 1; i>=10) {
            * sysout()
            * 3-=2;
            *
            * */

            }
        }

    }
