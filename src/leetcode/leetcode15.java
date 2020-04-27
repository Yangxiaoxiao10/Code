package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 杨晓晓
 * @Date 2020/4/13 20:19
 * @Version 1.0
 */
public class leetcode15 {
    public static void main(String[] args) {
        int []num ={ -1, 0, 1, 2, -1, -4};
        List<List<Integer>> a = threeSum(num);
//        for (List l: a) {
////            System.out.println(l);
////        }
        System.out.println(a);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums==null||len<3){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[0]>0) break;
            if (i>0 && nums[i]==nums[i-1]) continue;
            int L =i+1;
            int R = len-1;
            while (L<R){
                int sum = nums[i]+nums[L]+nums[R];
                if (sum==0){
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
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
