package arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2, 2}, 2);

    }

    public static int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0)
            return 0;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[len++] = nums[i];
            }

            System.out.println(Arrays.toString(nums));
        }


        return len;
    }
}
