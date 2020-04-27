package leetcode;

import java.util.HashMap;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 12:27
 * @Version 1.0
 */
public class toSum {
    public static void main(String[] args) {
        int [] a ={2,3,4,7,11};
        int b =9;
        int [] nn = to_sum(a,b);
        for (int i = 0; i < nn.length; i++) {
            System.out.print(nn[i]+" ");
        }
    }
    public static int[] to_sum(int[] num, int b) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < num.length; i++) {
            int com = b-num[i];
            if (!map.containsKey(com)){
                map.put(num[i],i);
            }else {
                res[0] =map.get(com);
                res[1] =i;
                break;
            }
        }
        return res;
    }

}
