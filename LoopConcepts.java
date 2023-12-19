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


    }
}
