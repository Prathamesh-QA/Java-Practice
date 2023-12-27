package Interface;

public class CitiBank implements USBank,EuropeBank{
    @Override
    public void credit() {
        System.out.println("Citi Bank --- Credit");
    }
    @Override
    public void debit() {
        System.out.println("Citi Bank --- Debit");
    }

    public void dematAccount(){
        System.out.println("Citi Bank --- Demat");
    }

    @Override
    public void moneyTransfer() {
        System.out.println("Citi Bank --- Money Transfer");
    }
}
