package SACSA;

//method: block of code that is executed when it is called

public class Methods {
    public static void main(String[] args) {

//        helloMethod();  // Method helloMethod needs to be static so that it can be accessed everywhere

        String name = "yahoo";
        helloMethod(name, 3); // can be called many times

        // in order for "name" to be passed you need arguments
        int x = 3;
        int y = 6;
        int z = add(x, y); // not really necessary as you can do "System.out.println(add(x,y));
        System.out.println(z);


    }

    static int add(int x, int y) { // int here says that there is a return type of int.
        int z = x+y;
        return z;

    }

    // in order for hello method to be called, the parameters must be matched.

    private static void helloMethod(String name, int amount) { // void = no return , private to make it private to the class
        System.out.println("hello " + amount);


    }
}