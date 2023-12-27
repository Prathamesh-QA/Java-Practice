package ExceptionHandling;

public class ExceptionHandlingConcept {

    public static void main(String[] args){
        String value = "val";
        String name = null;

        try {
            System.out.println(getValue(value));
        }catch (NumberFormatException | NullPointerException e){
            System.out.println("there is an exception!");
        }finally {
            System.out.println("in finally");
        }
        System.out.println(value);

    }

    public static int getValue(String value){
        Integer intValue = Integer.parseInt(value);
        return intValue;
    }

}
