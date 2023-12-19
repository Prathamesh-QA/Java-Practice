public class ConcatenationConcepts {

    public static void main(String args[])
    {

        // + -- Concatenation
        int a = 100;
        int b = 30;

        float c = 12.33f;

        String l1 = "Java";
        String l2 = "Selenium";

        System.out.println(a+b);
        System.out.println(l1+l2);
        System.out.println(l1+l2+a);
        System.out.println(l1+l2+a+b);
        System.out.println(a+b+l1+l2);
        System.out.println(l1+l2+(a+b));


        System.out.println(l1+l2+(a+c));

        System.out.println("------------------------------------");
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("The Temperature recorded today is: " + c);





    }
}
