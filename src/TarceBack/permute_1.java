package TarceBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 杨晓晓
 * @Date 2020/4/13 15:27
 * @Version 1.0
 */
public class permute_1 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length<1) return res;
        List<Integer> cur = new ArrayList<>();
        helper(cur,nums);
        return res;
    }
    private void helper( List<Integer> cur,int[] nums){
        if(cur.size()==nums.length){
            res.add(new ArrayList(cur));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(cur.contains(nums[i]))
                continue;
            cur.add(nums[i]);
            helper(cur,nums);
            cur.remove(cur.size()-1);

        }
    }
}
