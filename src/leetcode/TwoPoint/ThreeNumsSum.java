package leetcode.TwoPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 杨晓晓
 * @Date 2020/4/26 16:41
 * @Version 1.0
 */
public class ThreeNumsSum {
    public static void main(String[] args) {
        int []nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums==null||len<3){
            return res;
        }
        Arrays.sort(nums);
        for (int k = 0; k < len - 2; k++) {
            int L = k+1;
            int R = len-1;
            //nums[k]>0,不存在这样的数组，直接返回空res
            if (nums[k]>0) break;
            if (k>0&&nums[k]==nums[k-1]) continue;
            while (L<R){
                int sum = nums[k]+nums[L]+nums[R];
                if (sum==0){
                    res.add(Arrays.asList(nums[k],nums[L],nums[R]));
                    while (L<R && nums[L]==nums[L+1]) L++;
                    while (L<R && nums[R]==nums[R-1]) R--;
                    L++;
                    R--;
                }else if (sum<0){
                    L++;
                }else {
                    R--;
                }
            }
        }
        return res;
    }
}
