package niuke5;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 23:09
 * @Version 1.0
 */
public class StatisticsUpperChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            int count =0;
            for (char c:chars) {
                if (c>='A'&&c<='Z'){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
