package SwordOffer;

import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/4/13 22:32
 * @Version 1.0
 */
public class repeatString {
    public static void main(String[] args) {
        int [] nums ={2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
//        findRepeatNumber(nums);
    }
     public static int findRepeatNumber(int[] nums) {
            Set<Integer> numsSet = new HashSet<>();
            for(int num: nums) {
                if(!numsSet.add(num)) {
                    return num;
                }
            }
            return -1;
        }
}
