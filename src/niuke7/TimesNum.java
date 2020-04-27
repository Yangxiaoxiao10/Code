package niuke7;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 14:24
 * @Version 1.0
 */
//最小公倍数
public class TimesNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N =a*b;
            int n = N/gcd(a,b);
            System.out.println(n);
        }
    }
    public static int gcd(int a ,int b){
        int i = a;
        while ((a%i!=0)||(b%i!=0)){
            i--;
        }
        return i;
    }
}
