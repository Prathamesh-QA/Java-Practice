public class StringConcepts {

    public static void main(String args[])
    {
        String s1 = "Java";   //String literals
        String s2 = "Java";
        String s3 = "Java";

        s1 = "python";

        System.out.println(s1);
        System.out.println(s2);

        String n1 = new String("c++");
        System.out.println(n1);

        System.out.println(" ------------------ Operations --------------  ");
        // String operations
        String school = "St Joseph's high school";
        System.out.println(school.length());
        System.out.println(school.charAt(3));

        // String reverse
        StringBuffer sb = new StringBuffer(school);
        sb.append('.');
        sb.reverse();
        System.out.println(sb);
        //System.out.println();







    }
}
