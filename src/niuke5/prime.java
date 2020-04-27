package niuke5;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/31 21:27
 * @Version 1.0
 */
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int [] res = new int[2];
            for (int i = 1; i < n / 2; i++) {
                if (Isprime(i)&&Isprime(n-i)){
                    res[0] = i;
                    res[1] =n-i;
                }
            }
            System.out.println(res[0]);
            System.out.println(res[1]);;
        }
        sc.close();
    }
    public static  boolean Isprime(int n){
        for (int i = 2; i <n ; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
