public class OperatorsConcept {

    public static void main(String args[])
    {
        // <, >, <=, >=, ==, != ---> Operators
        int a = 30;
        int b = 30;

        //if-else conditions
        if(a>b){
            System.out.println("a is greater than b");
        }else {
            System.out.println("a is not greater than b");
        }

        // if with else-if condition
        if(a>b){
            System.out.println("a is greater than b");
        } else if (a<b) {
            System.out.println("a is lesser than b");
        }else if (a!=b) {
            System.out.println("a is not equals to b");
        }

        String name = "Java";
        if(name!=null){
            // most frequent conditional block
        }else{
            // rare frequent conditional block
            System.out.println("null pointer exception");
        }

        System.out.println("--------------------------------------------------------");

        // &, |, !
        int c = 700;
        int d = 500;
        int e = 900;

        if(c > d & c > e){
            System.out.println("c is greatest");
        } else if (d>e) {
            System.out.println("d is greatest");
        }else {
            System.out.println("e is greatest");
        }



    }

}
