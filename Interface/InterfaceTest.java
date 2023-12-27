package Interface;

public class InterfaceTest {

    public static void main(String args[])
    {
        //1st Concept
        // object of an interface can never be created
        System.out.println(USBank.minBalance);
        CitiBank c =new CitiBank();
        c.credit();
        c.debit();
        c.dematAccount();
        c.moneyTransfer();

        //2nd Concept
        //dynamic poylmorphism
        USBank b = new CitiBank();
        b.credit();
        b.debit();




    }

}
