package SACSA.BasicsWStrobe.Dog;


public class Dog { // on dog creation, these properties are created for them

    //Properties
    private int legs = 4;
    private String color = "Black";
    private int height;
    private int length;
    private int width;
    private String name;
    private String breed;


    // constructor | no return type | almost always public | initializes variables & makes object
    public Dog(String dogColor, int dogHeight, int dogLength, int dogWidth, String dogName, String dogBreed) {
        //this:  only necessary when you have things that are either the same name, like variables, OR needs to be THIS specific occurance (reference).
        color = dogColor;
        System.out.println("Dogs color is " + dogColor);
        height = dogHeight;
        System.out.println("dog height is " + dogHeight);
        length = dogLength;
        System.out.println("dog length is " + dogLength);
        width = dogWidth;
        System.out.println("dog width is " + dogWidth);
        name = dogName;
        System.out.println("dog name is " + dogName);
        breed = dogBreed;
        System.out.println("dog breed is " + dogBreed);

    }

    //bark, sit, sleep, eat, play
    public void bark() {
        System.out.println(name + " Barks.");
    }

    public void sit() {
        System.out.println(name + " Sits");
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public void eat() {
        System.out.println(name + " Eats");
    }

    public void play() {
        System.out.println(name + " Plays");
    }


    //setter
    public void setColor(String color) {
        this.color = color;
    }

    //getter
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}