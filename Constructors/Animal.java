package Constructors;

public class Animal {
    String foundIn;
    int population;

    public Animal(){
        System.out.println("Animal Const");
    }

    public Animal(String foundIn,int population){
        this.foundIn = foundIn;
        this.population = population;
    }

    int noOfLegs = 4;

    public void eat(){
        System.out.println("Animal Eating");
    }

    public void walk(){
        System.out.println("Animal walking");
    }


}
