package inheritance;

public class Animal {

    //methods and keywords

    public void eat() {
        System.out.println("I can eat");
    }

    public void sound() {
        System.out.println("Animal sound");
    }

    public void movement() {

    }
    public void poop(){

    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("My name is " + name);
    }
}

class Dog extends Animal {
    //methods and keywords of Animal
    //methods and keywords of Dog
    @Override
    public void sound() {
        System.out.println("Bark!! Bark!!!");
    }

    public void run(){
        System.out.println("I run fast");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow! Meow...");
    }
}

class Fish extends Animal {
    @Override
    public void movement() {
        System.out.println("Just keep swimming :P");
    }
}


class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("anni");
        animal.getName();


        Dog labrador = new Dog();
        //inheriting parent class method
        labrador.eat();

        labrador.setName("Chocolate");
        labrador.getName();
        labrador.sound();


        Cat fluffyCat = new Cat();
        fluffyCat.sound();

        Animal xyz = new Dog();
        xyz.sound();
       // xyz.run();
    }
}