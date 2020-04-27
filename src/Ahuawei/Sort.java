package Ahuawei;

import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/4/15 19:04
 * @Version 1.0
 */
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] name = s.split(",");
            if (check(name)){
                System.out.println(getName(name));
            }else {
                System.out.println("error.0001");
            }
        }
    }
    public static String getName (String[]name){
                Map<String, Integer> map = new TreeMap<>();
                //通过map来计数,并按照字典排序
                for (String str : name) {
                    if (!map.containsKey(str)) {
                        map.put(str, 1);
                    } else {
                        map.put(str, map.get(str) + 1);
                    }
                }
                //找出value值最大的key,value是次数
                int max = 0;
                for (Map.Entry<String, Integer> m : map.entrySet()) {
                    if (m.getValue() > max) {
                        max = m.getValue();
                    }
                }
                List<String> list = new ArrayList<>();
                for (String key : map.keySet()) {
                    //如果值相等，找到key
                    if (map.get(key) == max) {
                        list.add(key);
                    }
                }
                return list.get(0);
            }
    public static boolean check(String[]name){
        for (String str: name) {
            if (str.charAt(0)<'A'||str.charAt(0)>'Z'){
                return false;
            }//判断后面有没有大写
            else {
                for(char i =1;i<str.length();i++){
                    if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}