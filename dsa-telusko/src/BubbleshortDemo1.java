public class BubbleshortDemo1 {
    public static void main(String[] args) {

        int[] nums = {6, 5, 3, 7, 9, 8};
        int size = nums.length;
        int temp = 0;


        System.out.println("Before Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        //Swapping algo/logic
        System.out.println("Sorting[Bubble-Short] Steps: ");
        for (int i = 0; i < size; i++) {  //outer loop
            for (int j = 0; j < size - i - 1; j++) {  //inner loop
                if (nums[j] > nums[j + 1]) {  //comparing
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }


        System.out.println();
        System.out.println("After Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}
