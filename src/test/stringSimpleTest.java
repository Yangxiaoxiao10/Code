package test;

/**
 * @Author 杨晓晓
 * @Date 2020/3/28 20:52
 * @Version 1.0
 */

import java.util.Scanner;
public class stringSimpleTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.nextLine();
            String string2 = sc.nextLine();
            System.out.println(hander(string,string2));
        }
    }
    private static String hander(String string, String string2) {
        // TODO Auto-generated method stub
        int len1 = string.length();
        int len2 = string2.length();
        int dp[][] = new int[len1+1][len2+1];
        dp[0][0] = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i-1][0]+1;
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = dp[0][j-1]+1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (string.charAt(i-1) == string2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                dp[i][j] = Math.min(dp[i-1][j]+1, dp[i][j]);
                dp[i][j] = Math.min(dp[i][j-1]+1, dp[i][j]);
            }
        }
        String temp = String.valueOf(dp[len1][len2]+1);
        String res = "1/"+temp;
        return res;
    }

}
