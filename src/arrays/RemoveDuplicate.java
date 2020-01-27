package arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] ar = new int[]{0, 0, 1,1,2,2,3};
        int l = removeDuplicates(ar);
        for (int i = 0; i < l; i++) {
            System.out.println("ar[i] = " + ar[i]);
        }
        

    }

    public static int removeDuplicates(int[] nums) {

        int l = nums.length - 1;
        int i = 0;
        int j = 0;

        while (i <= l) {
            while (i<=l &&  nums[j] != nums[i]) {
                nums[++j] =nums[i];
                i++;
             }
            i++;
        }


        return j+1;

    }
}
