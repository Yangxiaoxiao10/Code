package other;

/**
 * @Author 杨晓晓
 * @Date 2020/3/30 23:12
 * @Version 1.0
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Entropy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        double n=s.length();
        double entropy=0;
        if (n != 0) {
            //初始化一个Map，计算字符出现次数
            HashMap<Character, Integer> m = new HashMap<>();
            for (Character c : s.toCharArray()) {
                if (m.containsKey(c)) {
                    m.put(c, m.get(c) + 1);
                } else {
                    m.put(c, 1);
                }
            }
            //用次数计算香农熵，只需要次数，不需要具体的字符是谁
            //四种遍历方式中推荐使用
            for (Map.Entry<Character, Integer> t : m.entrySet()) {
                double p = t.getValue() / n;
                entropy += p * -Math.log(p)/Math.log(2);
            }
        }
        String value=String.valueOf(entropy);
        int len=value.length()-value.indexOf(".");
        if (len>7)
            System.out.printf("%.7f", entropy);
        else
            System.out.println(entropy);
    }
}
