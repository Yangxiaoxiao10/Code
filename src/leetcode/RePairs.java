package leetcode;

/**
 * @Author 杨晓晓
 * @Date 2020/4/24 23:22
 * @Version 1.0
 */
public class RePairs {
    public static void main(String[] args) {
        int [] nums={7,5,6,4};
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]>nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
