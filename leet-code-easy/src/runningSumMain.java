public class runningSumMain {
    public static void main(String[] args) {
        //input array
        int[] nums = {1,1,1,1,1,1};

        //  int[] nums = {3,1,2,10,1};

        //Create the instance of runningSum class
        runningSum runner = new runningSum();

        //call the runningSumMethod and store the result
        int[] result = runner.runningSumMethod(nums);

        //Print the result
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
