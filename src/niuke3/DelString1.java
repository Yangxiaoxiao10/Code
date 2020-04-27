package niuke3;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 22:47
 * @Version 1.0
 */
//思想，使用数组下标和存值，判定次数。另一种方法是用hash表判定次数，取出values
public class DelString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int []num = new int[26];
            String s = sc.nextLine();
            for (int i = 0; i <s.length(); i++) {
                char c = s.charAt(i);
                //作为数组下标存储，出现次数多的，值++更大
                int n = (c-'a');
                num[n]++;
            }
            //找出最小的min
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 26; i++) {
                if (num[i]!=0&&num[i]<min){
                    min = num[i];
                }
            }
            //对应关系定好后，开始判断原字符串每个字符的出现次数，是否为min
            for (int i = 0; i < s.length(); i++) {
                int n = s.charAt(i) - 'a';
                if (num[n]!=min){
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
