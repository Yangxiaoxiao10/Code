package TarceBack;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 杨晓晓
 * @Date 2020/4/13 14:23
 * @Version 1.0
 */
public class permute {
    public static void main(String[] args) {
        int []nums ={1,2,3};
        System.out.println(permute1(nums));
    }
    private static List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<1) return res;
        helper( res ,new ArrayList<>(),nums, new boolean[nums.length]);
        return  res;
    }
    private static void helper(List<List<Integer>> res, List<Integer> cur,
                               int[] nums,boolean[] visited){
        //结束条件
        if (cur.size()==nums.length) {
            //满数字后，就添加到res结果集
            res.add(new ArrayList<>(cur));
            return;
        }
        //for循环
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;//进入for下层循环
            cur.add(nums[i]);//添加待选择表中元素——>cur中
            visited[i] = true;
            //递归查找树下面，nums是没变的，,res加了完整cur【如果完整的话】
            // cur加nums中的元素，visited属性值变化
            helper(res,cur,nums,visited);
            //撤销选择，回溯，进行下一次树遍历
            cur.remove(cur.size()-1);
            visited[i]=false;
        }
    }
}
