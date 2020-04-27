package test;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/23 21:46
 * @Version 1.0
 */
public class charTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(manacher(line));
        }
    }
    public static int manacher(String string){
        //填充字符串
        int count =0;
        char[] chars = string.toCharArray();
        StringBuffer sb = new StringBuffer();
        sb.append("$#");
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            sb.append("#");
        }
        sb.append("@");
        char[] chars1 = sb.toString().toCharArray();
        //定义manacher使用变量
        //max，上轮最长半径。id,前一轮的中心；p[] ，存放每个i的回文半径
        int []p = new int[sb.length()];
        int max =0;
        int id = 0;

        //循环查找
        for (int i = 0; i <sb.length() ; i++) {
            if (max>i){
                p[i] = Math.min(p[2*id-i],max-i);
            }else {
                p[i] = 1;
            }
            //计算超过上一轮的max下标后的数组元素，使用中心拓展法，对比查看，是否回文
            while (i-p[i]>=0 && i+p[i]<chars1.length&&chars1[i-p[i]] == chars1[i+p[i]]){
                p[i]++;
            }
            //越界后，更新
            if (i+p[i]>max){
                max = p[i]+i;
                id = i;
            }
            count = Math.max(count,p[i]-1);
        }
        return count;
    }
}
