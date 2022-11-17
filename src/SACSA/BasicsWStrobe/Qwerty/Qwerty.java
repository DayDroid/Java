package SACSA.BasicsWStrobe.Qwerty;

import SACSA.BasicsWStrobe.Dog.Dog;

/*
symbols = variable
 */
public class Qwerty {

    public static void main(String[] args) {
        Dog x = new Dog("Black", 0 ,0,0, "Chip", "Potato");
        Dog y = new Dog("White", 0 ,0,0, "Lettuce", "Head");

        Switch(x ,y);
        System.out.println(x.getName() + " " + y.getName());

    }

    private static void Switch(Dog b, Dog y){
        Dog a = b;
        System.out.println(a.getName() + " " + b.getName());
    }





}
