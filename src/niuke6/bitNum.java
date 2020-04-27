package niuke6;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/4 22:27
 * @Version 1.0
 */
public class bitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int i = sc.nextInt();
            String s = Integer.toBinaryString(i);
            String[] sp = s.split("0+");
            int max =-1;
            for (String s1:sp) {
                if (s1.length()>max){
                    max = s1.length();
                }
            }
            System.out.println(max);
        }
    }
}
