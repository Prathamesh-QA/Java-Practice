package Constructors;

public class Forest {

    String name;
    int area;

    //hidden constructor - if constructor is not defined it will call hidden constructor
    //if defined explicitly then it will default / no-arguments constructor
    //2 . Args constructor


    public Forest(){
        System.out.println("Default / No Args constructor");
    }

    public Forest(int a){
        System.out.println("Args constructor");
        System.out.println("value input :" + a);
    }

    public Forest(String name, int area){
        this.name=name;
        this.area=area;

    }

}
