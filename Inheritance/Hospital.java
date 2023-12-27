package Inheritance;

public class Hospital {

    public void calculateBill(){
        System.out.println("Calculating bills without insurance.");
    }

    public void calculateBill(int insuranceAmount){
        System.out.println("Calculating bills with insurance.");
    }

    public void calculateBill(int insuranceAmount, String areaName){
        System.out.println("Calculating bills with insurance and area name.");
    }

}
