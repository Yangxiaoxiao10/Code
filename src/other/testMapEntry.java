package other;

import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/3/31 23:52
 * @Version 1.0
 */
public class testMapEntry {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("aa 20",20);
        map.put("bb 50",50);
        map.put("cc 50",50);
        map.put("dd 30",30);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)->(o2.getValue()-o1.getValue()));//降序
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey());
        }
    }
}
