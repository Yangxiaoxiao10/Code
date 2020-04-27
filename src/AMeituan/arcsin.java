package AMeituan;

//import org.apache.commons.math3.util.FastMath;

import DataStruct.BiTree.LevelOrder;
import org.omg.CORBA.INTERNAL;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author 杨晓晓
 * @Date 2020/4/23 22:35
 * @Version 1.0
 */
public class arcsin {
    public static void main(String[] args) {

        String s =  "aabbbccccdijlsl";
//        System.out.println(getMostTimes(s));
        TreeMap<Character, Integer> map = getMostTimes1(s);
        for (Map.Entry<Character ,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    private  static TreeMap<Character,Integer> getMostTimes1(String s){
        //字典序输出每个字符和其出现的次数
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        return map;
    }
    private  static char getMostTimes(String s){
        int[] chars = new int[128];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }
        int max =0;
        int MostTimesNum=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (max<chars[i]){
                max =chars[i];
                MostTimesNum =i;
            }
        }
        return (char)MostTimesNum;
    }
}
