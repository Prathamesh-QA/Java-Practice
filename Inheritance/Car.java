package Inheritance;

public class Car {
    public int noOfWheels = 4;
    public int noOfGearBox = 1;

    public void startEngine(){
        System.out.println("Car --> Start");
    }
    public void stopEngine(){
        System.out.println("Car ---> Stop");
    }
    public void accelaration(){
        System.out.println("Car ---> Accelaration");
    }
    public void braking(){
        System.out.println("Car ---> braking");
    }

}
