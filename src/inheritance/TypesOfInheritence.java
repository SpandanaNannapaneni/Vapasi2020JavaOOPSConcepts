package inheritance;

//Multilevel Inheritance
class Vehicle {
    public void wheels(int numberOfWheels) {
        System.out.println("It has " + numberOfWheels + "Wheels");
    }
    public void display(String text){
        System.out.println(text);
    }
}

class MotarVehicles extends Vehicle {
    String fuelType;
    public void transportation(){
        System.out.println("Driven on Road & can carry people and goods");
    }
}

class RailedVehicles extends Vehicle{
    String powerType;
    public void rails(){
        System.out.println("Runs on Tracks/Rails");
    }
}

class Car extends MotarVehicles {
     String model;
     public void mileage(int numberOfKilometersPerLiter){
         System.out.println("Mileage :" + numberOfKilometersPerLiter);
     }
}



//Hierarchical Inheritance


//Multiple Inheritance :.................

public class TypesOfInheritence {
    public static void main(String[] args) {

    }
}

