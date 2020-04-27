package bitTest;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/3 22:34
 * @Version 1.0
 */
public class BitReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int i = sc.nextInt();
            String s = Integer.toBinaryString(i);
            int ans =0;
            System.out.println("输入整数为="+i);
            for (int j = s.length()-1; i!=0; i = i>>>1, j--) {
                ans +=(i&1)<<j;
            }
            String s1 = Integer.toBinaryString(ans);
            System.out.println("输出整数为="+ans);
            System.out.println("数"+s+"二进制反转后"+s1);
        }

    }
}
