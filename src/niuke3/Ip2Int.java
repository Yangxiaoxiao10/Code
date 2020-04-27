package niuke3;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/26 13:32
 * @Version 1.0
 */
/*
移位运算退位>>,进位<<. 将单个string转化为long。Long.parseLong/Long.valueOf
*/

public class Ip2Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(IP2Long(s1));
            System.out.println(Long2IP(s2));
        }
    }
    public static long IP2Long(String s1){
        String[] str1 = s1.split("\\.");
        System.out.println("");
        long a =(Long.parseLong(str1[0])<<24)+(Long.parseLong(str1[1])<<16)+
                (Long.parseLong(str1[2])<<8)+Long.parseLong(str1[3]);
        return a;
    }
    public static String Long2IP(String s){
        long ip = Long.parseLong(s);
        //做减法，先减去算出来的，在退位
        long a = ip>>24;
        long b = (ip-(a<<24))>>16;
        long c = (ip-(a<<24)-(b<<16))>>8;
        long d = ip-(a<<24)-(b<<16)-(c<<8);
        String res = a+"."+ b +"."+ c +"."+d;
        return res;
    }
}
