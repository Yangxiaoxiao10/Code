package DP;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/12 17:26
 * @Version 1.0
 */
//最长公共字符串
public class LIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            String temp;
            //让str1短，str2长
            if (str1.length()>str2.length()){
                temp = str1;
                str1 = str2;
                str2 = temp;
            }
            getLIS(str1,str2);
        }
    }
    public static void getLIS(String str1,String str2){
        if (str1==null||str2==null){
            System.out.println("-1");
        }
        int len1 = str1.length();
        int len2 = str2.length();
        int [][]dp =new int[len1+1][len2+1];
        int max =0;
        int resIndex=0;
        for (int i = 1; i <len1+1 ; i++) {
            for (int j = 1; j <len2+1 ; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(dp[i][j]>max){
                        max = dp[i][j];
                        resIndex =i;
                    }
                }
            }
        }
//        StringBuffer sb = new StringBuffer();
//        for (int i = resIndex-max; i <resIndex ; i++) {
//            sb.append()
//        }
        if (max==0){
            System.out.println("-1");
        }
        //substring，起止index，前有后无
        String s = str1.substring(resIndex - max, resIndex);
//        System.out.println((resIndex - max)+","+resIndex);
        System.out.println(s);
    }
}
