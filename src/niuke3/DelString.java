package niuke3;

import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/3/22 15:10
 * @Version 1.0
 */
/*
思想是，
1  把获取到的字符串转换为字符数组ch[]，
2  存入LinkMap<char,int>，默认是有顺序的
3  然后用ch[]来初始化map，并在此过程中计数，【map真好用啊】，如果key已经存在，则value+1，
4  这样就可以知道ch[]值出现的次数；
5  最后，用collection 集合，来找出map中values值，找出最小值对应的key。
6  把非最小值key的 value连接到StringBuffer 字符串上，最后输出。
 */
public class DelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String line = sc.nextLine();
            char[] ch = line.toCharArray();
            Map<Character,Integer> map = new LinkedHashMap<>();
            for (char c : ch){
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
            Collection<Integer> values = map.values();
            int minIndex = Collections.min(values);
            StringBuffer sb = new StringBuffer();
            for (char keys:ch) {
                if (map.get(keys)!= minIndex){
                    sb.append(keys);
                }
            }
            System.out.println(sb);
        }
    }
}
