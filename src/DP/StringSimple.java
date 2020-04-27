    package DP;

    import java.util.Scanner;

    /**
     * @Author 杨晓晓
     * @Date 2020/3/28 15:43
     * @Version 1.0
     */
    //字符串之间的距离
    public class StringSimple {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
                System.out.println(calculateStringDistance(s1,s2));
            }
        }
        public static  String  calculateStringDistance(String string1, String string2)
        {
            int len1 = string1.length();
            int len2 = string2.length();
            int [][]d = new int[len1+1][len2+1];
            for (int i = 0; i <= len1; i++) {
                d[i][0] = i;
            }
            for (int i = 0; i <=len2; i++) {
                d[0][i] = i;
            }
            for (int i = 1; i <=len1; i++) {
                for (int j = 1; j <=len2; j++) {
                    if (string1.charAt(i-1)==string2.charAt(j-1)){
                        d[i][j] = d[i-1][j-1];
                    }else {
                        d[i][j] = Math.min(Math.min(d[i-1][j] + 1 ,d[i][j-1] + 1) , d[i-1][j-1] + 1);
                    }
                }
            }
            String temp = String.valueOf(d[len1][len2]+1);
            String res = "1/"+temp;
            return res;
        }
    }
