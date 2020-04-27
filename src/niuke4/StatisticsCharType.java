package niuke4;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 19:55
 * @Version 1.0
 */
public class StatisticsCharType {
    private static int EngCount=0;
    private static int blankCount=0;
    private static int numCount=0;
    private static int othersCount =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            //四个函数，求英文，空格，数字，其他字符
            System.out.println(getEnglishCharCount(s));
            System.out.println(getBlankCharCount(s));
            System.out.println(getNumberCharCount(s));
            System.out.println(getOtherCharCount(s));
        }
    }

    //英文
    public static int getEnglishCharCount(String s){
//        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch>= 'a'&&ch<='z'||ch>='A'&&ch<='Z'){
                EngCount++;
            }
        }
        return EngCount;
    }
    //空格
    public static int getBlankCharCount(String s){

        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i] ==' '){
                blankCount++;
            }
        }
        return blankCount;
    }
    //数字
    public static int getNumberCharCount(String s){

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch>= '0'&&ch<='9'){
                numCount++;
            }
        }
        return numCount;
    }
    //其他字符
    public static int getOtherCharCount(String s){

        int n = s.length();
//        othersCount = n -getBlankCharCount(s)-getEnglishCharCount(s)-getNumberCharCount(s);
        othersCount = n - blankCount-numCount-EngCount;
        return othersCount;
    }
}
