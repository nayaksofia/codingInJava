public class Sum1Main {
    public static void main(String[] args) {
        //Input array
        int[] n = {3,1,2,10,1};

        //Initiate object of the Class RunningSumM1
        RunningSumM1 m1 = new RunningSumM1();

        //Call the method and assign the result
        int[] result = m1.Sum1(n);


        //Print the output
        for(int res:result){
            System.out.print(res +" ");
        }

    }
}
