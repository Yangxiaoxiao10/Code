package other;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 杨晓晓
 * @Date 2020/3/30 23:19
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        String str ="aaaaaabbbbbccc";
        double len = str.length();
        double entropy =0;
        Map<Character,Integer> map = new HashMap<>();
        //初始化map
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        for (Map.Entry<Character,Integer> c: map.entrySet()) {
            double p = c.getValue()/len;
            entropy += (-p)* Math.log(p)/ Math.log(2);
        }

       System.out.printf("%.7f",entropy);
    }
}
