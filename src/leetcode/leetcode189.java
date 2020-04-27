package leetcode;

/**
 * @Author 杨晓晓
 * @Date 2020/4/24 15:30
 * @Version 1.0
 */
//旋转数组
public class leetcode189 {
    public static void main(String[] args) {
        int []num = {1,2,3,4,5,6,7};
//        rotate(num,3);
        rotate1(num,3);
    }
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            //pre定义在外面，下面的循环，每次结束后都会改变数组的元素
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i]+" ");
        }
    }
    public static void rotate1(int[] nums, int k) {
        int[] a =new int[nums.length];
        for (int i = 0; i < nums.length ;i++) {
            a[(i+k)%nums.length] = nums[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
