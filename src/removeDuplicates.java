//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//
// 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//O(1)空间复杂度，使用双指针；i作为慢指针，计数首次出现的数字；j作为快指针，计数i后面的值
// 如果有重复，则循环内不做处理，循环迭代至j下一层，如果没有重复，将新值赋值给最新的nums[i];

import java.util.Arrays;
import java.util.Stack;

public class removeDuplicates {
    public int remove(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i+1);
        return i + 1;
    }
    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();
        int []nums={0,1,2,2,3,3,3,4,5,5,6,7,7};
        rd.remove(nums);
    }
}
