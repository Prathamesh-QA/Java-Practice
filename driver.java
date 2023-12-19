public class driver {
    int vars = 100;

    public static void main(String args[])
    {

        Car c = new Car();
        c.m = 10;
        c.n = 20;
        System.out.println(c.j);


        Car d = new Car();
        d.m = 10;
        d.n = 20;

        System.out.println(d.m);

        // null reference object
        new Car();

        Car z = null;
        z = new Car();
        System.out.println("------------");

        System.out.println(z.m);

        // --------------------------------------------------------------------- //
        System.out.println( " -------------------------------------------------------------");

        Job j = new Job();
        j.m1();
        int s = 100;
        int y = 200;
        j.sum(s,y);
        System.out.println("------------------multiply-------------------");
        int multipyResult = j.multipy(s,y);
        System.out.println(j.multipy(s,y));
        System.out.println(multipyResult);






    }


}
