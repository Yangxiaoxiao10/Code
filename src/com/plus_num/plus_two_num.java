package com.plus_num;

import java.util.Arrays;

public class plus_two_num {
    public static void main(String[] args) {
//        int [] nums=new int[10];
        plus_two_num h= new plus_two_num();
        int []nums={2,3,7,11};
        int target=9;
        h.twoSum(nums,target);

        //        twoSum(nums,target);
    }
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    int []a=new int[]{i,j};
                    System.out.println(Arrays.toString(a));
                    return a;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
