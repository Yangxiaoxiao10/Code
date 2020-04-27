package DP;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/7 21:05
 * @Version 1.0
 */
//参考来源，牛客评论区第二页，图解参考leetcode44某csdn博主解释。
public class StringMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(match(s1,s2));
        }
    }
    public static boolean match(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        boolean[][] dp = new boolean[len1+1][len2+1];
        dp[0][0]=true;
        for (int i = 1; i <=len1; i++) {
            for (int j = 1; j <=len2; j++) {
                //当前*，判定当前dp[i][j],取决于数组左边和上边的值，结合图看
                //dp[i-1][j]，上一行，即*匹配0，[i][j-1]，*匹配一个以上，结合表理解i位置
                //     a        |          a   b
                //a             |      a
                //*    i        |      *       i
                if (s1.charAt(i-1)=='*'&&dp[i-1][j]||dp[i][j-1]){
                    dp[i][j]= true;
                    //当前为？，判定当前dp[i][j]，取决于左上角，因为是？是一对一，如果之前的
                    //匹配好了，那么当前s1的？，必定可以匹配到s2的某字符串
                }else if (s1.charAt(i-1)=='?'&&dp[i-1][j-1]){
                        dp[i][j]=true;
                }else {
                    //最后是没有通配符，判断char值是否相等
                    if (dp[i-1][j-1]&&(s1.charAt(i-1)==s2.charAt(j-1))){
                        dp[i][j]=true;
                    }
                }
            }
        }
        return dp[len1][len2];
    }
}
