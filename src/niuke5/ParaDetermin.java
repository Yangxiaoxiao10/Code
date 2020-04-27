package niuke5;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/31 22:06
 * @Version 1.0
 */
public class ParaDetermin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            int count =0;
            int yinhao = 0;
            for (int i = 0; i < s.length(); i++) {
                //前排提示，空格也是字符
                //判断是否是引号，是的话yinhao++，直接下轮循环
                if (s.charAt(i)=='\"'){
                    yinhao++;
                    continue;
                }
                //如果不是空格，那就把当前字符放到sb
                if (s.charAt(i)!=' '){
                    sb.append(s.charAt(i));
                }
                //如果是空格，这里又是两种情况，1普通空格，就换行，2引号内的空格
                else if (yinhao%2==0){//1 遍历发现当前字符为普通空格字符,加入换行符和单词计数count，便于输出
                    sb.append('\n');
                    count++;
                }else {//2 如果是引号内的空格，就继续把该空格加入sb
                    sb.append(' ');
                }
            }
            System.out.println(count+1);
            System.out.println(sb.toString());
        }
    }
}
