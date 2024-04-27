public class runningSum {
    public static int[] runningSumMethod(int[] nums){
        int[] results = new int[nums.length];
        results[0] = nums [0];

        for(int i=1; i < nums.length; i++){
            results[i] = nums[i] + results[i-1];
        }
        return results;
    }
}
//Time Complexity :O(n)
//Space Complesity: O(n)