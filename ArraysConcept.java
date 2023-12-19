public class ArraysConcept {

    public static void main(String args[])
    {

        //languages
        String langs1 = "Java,Pyhton,c++,ruby";
        String langs2 = "python";
        String langs3 = "c++";

        String[] languages = new String[2]; //declaration
        System.out.println(languages.length);
        languages[0] = "Java";
        languages[1] = "python";
        languages[2] = "c++";

        System.out.println(languages[0] + ", " + languages[1] + ", " + languages[2]);

        int[] marks = new int[2];
        marks[0] = 78;
        marks[1] = 84;

        System.out.println();

        boolean[] result = new boolean[2];
        result[0] = true;
        result[1] = false;

        int[][] flatsAllocation = new int[2][3];
        flatsAllocation[0][0] = 301;
        flatsAllocation[2][2] = 560;

        String temp = "Java is a good language";
        String temp1 = ", but a difficult language";
        //1st task - find space location
        //2nd task - string reverse with string buffer
        //3rd task - join 2 string





    }



}
