package niuke4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 22:45
 * @Version 1.0
 */
public class StatisticsCharTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            HashMap<Character, Integer> map = new HashMap<>(127);
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                //在map中计算字符出现的次数
                if (!map.containsKey(c)){
                    map.put(c,1);
                }else {
                    map.put(c,map.get(c)+1);
                }
            }
            //建立一个treeMap[根据key的大小自然排序，从大到小，或者字典],存放按照出现次数多少排序的有序元素
            TreeMap<Integer, Character> treeMap = new TreeMap<>();
            //找到字符，把字符 存到value，字符的出现次数。存到key
            for (char c :map.keySet()) {
                treeMap.put( map.get(c)*128+128-c , c);
                //map.get(c)*128+128-c，这个操作，在treeMap中，ascll码大的字符，其key是小的
                // 所以该键值对会放在同次数的字符后面，比如aadd，次数都为2，但是在treeMap中
                //{ <2*128+128-c,d>,<2*128+128-c>,a },第一个c是d的ascll码，100，第二个a是97

            }
            //输出treeMap的key
            StringBuilder sb = new StringBuilder();
            for (int times :treeMap.keySet()) {
                sb.append(treeMap.get(times));
            }
            System.out.println(sb.reverse().toString());
            }
        }
    }