package Inheritance;

public class BMW extends Car{
    public int noOfWheels = 6;
    public int noOfGearBox = 2;

    public void startEngine(){
        System.out.println("BMW --> Start");
    }
    public void theftSafety(){
        System.out.println("BMW --> Safety");
    }
    public void musicSystem(){
        System.out.println("BMW --> Music system");
    }


}
