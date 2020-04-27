package niuke5;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/2 13:13
 * @Version 1.0
 */
public class BinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String s = Integer.toBinaryString(n);
            int count = 0;
            char[] chars = s.toCharArray();
            for (char ch:chars) {
                if (ch=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
