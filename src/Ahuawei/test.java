package Ahuawei;



import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/4/15 19:04
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        String s ="Tom,Lily,Tom,Lucy,Lucy,Lucy,Tom,Jack,Jack,Jack";
        String[] name = s.split(",");
        List<String> list = getName(name);
        System.out.println(list.size());
        for (String s1:list) {
            System.out.println(s1);
        }
    }
    public static List<String> getName(String[] name){
        Map<String, Integer> map = new TreeMap<>();
        //通过map来计数,并按照字典排序
        for (String str:name) {
            if (!map.containsKey(str)){
                map.put(str,1);
            }else{
                map.put(str,map.get(str)+1);
            }
        }
        //找出value值最大的key,value是次数
        int max=0;

        for (Map.Entry<String,Integer> m:map.entrySet()) {
            if (m.getValue()>max){
                max = m.getValue();
            }
        }
        List<String> list = new ArrayList<>();
        for (String key: map.keySet()) {
            //如果值相等，找到key
            if (map.get(key)==max){
                list.add(key);
            }
        }
//        return list.get(list.size()-1);
        return list;
    }
}
