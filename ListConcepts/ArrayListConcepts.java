package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

    public static void main(String args[])
    {

        //Diff between Array and Array List
        //1. Array list are dynamic data structure whereas arrays are static

        //Properties
        //1. Dynamic in nature
        //2. Maintains insertion order
        //3. Synchronized - Not Thread safe (drawback)
        // 4. Allows access to data based on indexing -- > Easy data fetching

        Integer arr[] = new Integer[3];

        //Define
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al.size()); //4
        al.add(60);
        al.add(70);
        System.out.println(al.size()); //6

        ArrayList al1 = new ArrayList();
        al1.add(120); //0
        al1.add(130);//1
        al1.add(140);//2
        al1.add(150);//3
        System.out.println(al1.get(1));

        // Data traversing
        //1. For Loop
        //2. Iterator
        // To get access to all data
        for (int i=0;i< al1.size();i++){
            System.out.println(al1.get(i));
        }

        //Generics
        ArrayList al2 = new ArrayList();  // Non generic defination
        al2.add(500);
        al2.add("Tom");
        al2.add(12.33);
        al2.add(true);

        //Generic way to define an Integer array
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(300);
        values.add(13);
        ArrayList<String> names = new ArrayList<String>();


        //
        ArrayList<Object> data = new ArrayList<Object>();
        data.add("Tom");
        data.add(12.45);
        data.add('T');
        data.add(false);


        // ------------------------------------------------------------------------------------
        System.out.println("=========================================================================");
        //1
        Employee e1 = new Employee("Tom",25,"HR", true);
        //2
        Employee e2 = new Employee("Peter",28,"Admin",false);
        //3
        Employee e3 = new Employee("John",32,"Sales",true);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Iterator<Employee> itEmp = employees.iterator();
        while (itEmp.hasNext()){
            Employee e = itEmp.next();
            System.out.println(e.name + " " + e.age + " " + e.dept + " " + e.isCurrentlyActive);
        }
        System.out.println("=========================================================================");
        // FOR-EACH Loop we can use for loop without indexing
        for(Employee emp : employees){
            System.out.println(emp.name + " " + emp.age + " " + emp.dept + " " + emp.isCurrentlyActive);
        }











    }

}
