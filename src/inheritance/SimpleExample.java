package inheritance;


class Fruit {
    public String colour;

    public void type(String type) {
        System.out.println("Type of fruit :" + type);
    }

    public void welcomeMessage() {
        System.out.println("Welcome to Fruit Market");
    }
}

class Orange extends Fruit {
    public void shape(String shape) {
        System.out.println("Shape of fruit :" + shape);
    }
}

class Apple extends Fruit{

}

public class SimpleExample {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(); // instantiating parent class
        fruit.welcomeMessage();
        fruit.type("(fruit type will be mentioned here)");

        Orange orange = new Orange(); // instantiating child class
        orange.colour = "orange";
        System.out.println("\nFruit colour is " + orange.colour);
        orange.type("citrus"); //method in parent class
        orange.shape("round"); //method in child class

        Fruit fruit1 = new Orange();// instantiating child object with parent reference
        fruit1.colour = "green";
        System.out.println("\nFruit colour is " + fruit1.colour);
        fruit1.type("pear");



        Fruit f = new Apple();

        Apple apple = new Apple();
    }
}