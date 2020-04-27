package Ahuawei;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/15 20:49
 * @Version 1.0
 */
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            String[] s1 = s.split(" ");
            String key = s1[0];
            String stringMatch = s1[1];
            String[] read = stringMatch.split(",");
            for (String ss:read) {
                if (ss.startsWith(key)){

                }
            }

        }
    }
}
