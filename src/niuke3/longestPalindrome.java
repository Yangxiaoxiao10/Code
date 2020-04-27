package niuke3;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/25 22:37
 * @Version 1.0
 */
public class longestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(Palindrome(s));
        }
    }
    private static int Palindrome(String str){
//        int n = str.length();
        int count =0;
        StringBuffer sb = new StringBuffer();
        sb.append("$#");
        char[] ch = str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            sb.append(ch[i]);
            sb.append("#");
        }
        sb =sb.append("@") ;
        int[] p = new int[sb.length()];
        char[] ch1 = sb.toString().toCharArray();
        int max =0;
        int id = 0;
        for (int i =0; i <ch1.length ; i++) {
            if (max>i){
                p[i] = Math.min(p[2*id-i], max-i);
            }else {
                p[i]=1;
            }
            //越界后，继续中心拓展
            while (i-p[i]>=0&&i+p[i]< ch1.length && ch1[i-p[i]]==ch1[i+p[i]]){
                p[i]++;
            }
            if (i+p[i]> max ){
                max =i +p[i];
                id =i;
            }
            count = Math.max(count,p[i]-1);
        }
        return  count;
    }
}
