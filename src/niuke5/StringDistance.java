package niuke5;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/1 22:32
 * @Version 1.0
 */
//Levenshtein Distance字符串编辑距离
public class StringDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(LevDistance(str1,str2));
        }
        sc.close();
    }
    public static int LevDistance(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int [][]dp = new int[len1+1][len2+1];
        for (int i = 0; i < len1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < len2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <=len1; i++) {
            for (int j = 1; j <=len2; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1]+1,dp[i-1][j]+1),dp[i-1][j-1]+1);
                }
            }
        }
        int temp = dp[len1][len2];
        return temp;
    }
}
