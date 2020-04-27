package niuke6;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/7 14:08
 * @Version 1.0
 */
//等差数列
public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int sum =0;
            if (n<1){
                System.out.println(-1);
            }else {
                sum = 2*n + 3*n*(n-1)/2;
                System.out.println(sum);
            }
        }
    }
}
