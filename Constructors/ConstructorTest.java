package Constructors;

import java.io.FilterOutputStream;

public class ConstructorTest {

    public static void main(String args[])
    {
        // Argument constructor is used to initialize the class variables with default values
        Forest f = new Forest(10);

        // to avoid coding and no of lines of code
//        Forest f1 = new Forest();
//        f1.name = "Amazon";
//        f1.area = 5000;

        Forest f2 = new Forest("Pench", 10000);
        Forest f3 = new Forest("Kaziranga", 7000);
        System.out.println("Name: " + f2.name + " Area: " + f2.area);
        System.out.println("Name: " + f3.name + " Area: " + f3.area);

        System.out.println("===========================================");

        //Initialize Dog class with default values
        Dog d = new Dog("Tom",2);
        System.out.println("Name: " + d.name + " Age: " + d.age);

        Dog d1 = new Dog();
        System.out.println("Name: " + d1.name + " Age: " + d1.age);

        Dog d2 = d1.getDogStatus();

        System.out.println("===========================================");
        Cat c = new Cat("Forest",500);
        c.eat();
        System.out.println("Found In: " + c.foundIn + " Population: " + c.population);







    }
}
