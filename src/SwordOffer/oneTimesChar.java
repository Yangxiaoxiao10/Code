package SwordOffer;

import java.util.HashMap;

/**
 * @Author 杨晓晓
 * @Date 2020/4/21 13:43
 * @Version 1.0
 */
public class oneTimesChar {
    public static void main(String[] args) {

    }
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        int pos =-1;
        for (int i = 0; i < str.length(); i++) {
            //ch是键值
            char ch = str.charAt(i);
            if (1==map.get(ch)){
                return i;
            }
        }
        return pos;
    }
}
