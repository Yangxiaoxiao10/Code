package test;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/1 19:58
 * @Version 1.0
 */
public class test3 {
    public static void main(String[] args) {
        String[] dict = { "surprise", "happy", "ctrip", "travel", "wellcome",
                "student","system","program","editor"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        for (int i = 0; i <dict.length; i++) {
            if (calculate(s,dict[i])){
                System.out.println(dict[i]);

            }else {
                count++;
            }
        }
        if (count==dict.length){
            System.out.println("null");
        }
    }
    public static boolean calculate(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int dp[][] = new int[len1+1][len2+1];
        for (int i = 0; i < len1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < len2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <=len1; i++) {
            for (int j = 1; j <= len2 ; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+1);
                }
            }
        }
        int temp = dp[len1][len2];
        if (temp<=2){
            return true;
        }
        return  false;
    }
}
