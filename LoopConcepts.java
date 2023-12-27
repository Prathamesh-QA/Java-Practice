public class LoopConcepts {

    public static void main(String args[])
    {

        // While loop
        //1 initialization, 2 condition check, 3 incremental/decremental stage
        // 10 reps
        // disadvantage
        // blocking loop
        int count = 1;
        while (count <= 10){
            System.out.println(count);
            //count = count + 1;
            count++;
        }

        //for loop --> step loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("------------------------------------------");
        for(int k=1;k<=2;k++){ // k=1,2
            for(int l=1;l<=5;l++){  // l 1, 2,3,4 5 -- >  l1,2,3.4.5
                System.out.println(l); //1 2 3,4,5
            }
        }

        //1. Write a program to add the numbers from the start of the loop to end of the loop for eg : for-loop 1-10 :- Ans 55 (Print 55)
        //2. Print numbers -10 to 10 using for loop
        //3. Variables int a = 175, b = 332, c = 231 find the smallest number using conditional operators





    }
}
