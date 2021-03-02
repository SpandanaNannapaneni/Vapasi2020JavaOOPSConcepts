package inheritance;


class Fruit {
    String color;

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

public class SimpleExample {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(); // instantiating parent class
        fruit.welcomeMessage();
        fruit.type("(fruit type will be mentioned here)");

        Orange orange = new Orange(); // instantiating child class
        orange.color = "Orange"; //variable in parent class
        orange.type("citrus"); //method in parent class
        orange.shape("round"); //method in child class

        Fruit fruit1 = new Orange();// instantiating child object with parent reference
        fruit1.color = "red";
        fruit1.type("oval");
    }
}