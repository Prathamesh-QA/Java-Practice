package Constructors;

public class Dog {

    String name;
    int age;

    public Dog(){
        this("Bob",3); // used as a constructor
    }

    public Dog(String name,int age){
        this.name = name;  //used to differentiate the vars name
        this.age = age;
    }

    public Dog getDogStatus(){
        return this;  // used to return the self class object
    }

    public void login(String username,String password){
        // enter user name
        //enter password
        //click ok
        //return new Dashboard();  // we can use the page chaining concept by returning the object of any other class
    }
}
