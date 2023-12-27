package Constructors;

public class Cat extends Animal{

    public Cat(String foundIn,int population){
        super(foundIn,population); //
        System.out.println("Cat const");
    }

    public void eat(){
        super.eat();
        super.walk();
        System.out.println("Animal has " + super.noOfLegs + " legs");
        System.out.println("Cat eats fish");
    }

}
