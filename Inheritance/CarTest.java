package Inheritance;

public class CarTest {

    public static void main(String args[])
    {
        // Static / Compile Time Polymorphism --> Method Overriding
        // When we have same properties in child as well as parent then the properties of
        // child class will be overriden which is called Method Overriding
        BMW b = new BMW();
        b.startEngine();
        b.accelaration();
        b.theftSafety();

        System.out.println("------------------------");

        Car c = new Car();
        c.startEngine();

        System.out.println("------------------------");

        // Object of the child class referred by the reference variable of the parent class
        // is called dynamic/run-time polymorphism
        //Top Casting
        Car c1 = new BMW();
        c1.startEngine();
        System.out.println(c1.noOfGearBox);
        System.out.println(c1.noOfWheels);

        System.out.println("------------------------");
        //Class Cast Exception: when a parent class object is trying to refer to the child class reference variable
        // Down Casting
        //BMW b1 = (BMW) new Car();




    }



    }
