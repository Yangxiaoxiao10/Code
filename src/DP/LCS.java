package DP;

/**
 * @Author 杨晓晓
 * @Date 2020/4/12 15:58
 * @Version 1.0
 */
public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCABA";
        int m = str1.length();
        int n = str2.length();
        int[][] b = new int[m+1][n+1];
        int c =getLCS(str1,str2,b);
        System.out.println(c);
        lcs(m,n,str1,b);
    }
    public static int getLCS(String str1,String str2,int[][] b){
        /*
        求出dp数组，并且相应位置存入来源路径于b[][]中；
         */
        int len1 = str1.length();
        int len2 = str2.length();
        int [][]dp = new int[len1+1][len2+1];
        if (len1==0||len2==0)
            return 0;
        for (int i = 0; i < len1+1; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < len2 + 1; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < len1+1; i++) {
            for (int j = 1; j < len2+1; j++) {
                if (str1.charAt(i-1)== str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    b[i][j]=1;
                }else {
                    if (dp[i-1][j]+1>=dp[i][j-1]+1){
                        dp[i][j] = dp[i-1][j];
                        b[i][j] = 2;
                    }else {
                        dp[i][j] = dp[i][j-1];
                        b[i][j] = 3;
                    }
                }
            }
        }
        return dp[len1][len2];
    }
    public static void lcs(int i,int j,String str1,int[][]b){
        if(i==0 || j==0)
            return;
        if(b[i][j]==1){
            lcs(i-1,j-1,str1,b);
            System.out.print(str1.charAt(i-1));
        }else{
            if(b[i][j]==2) lcs(i-1,j,str1,b);
            else lcs(i,j-1,str1,b);
        }
    }
}