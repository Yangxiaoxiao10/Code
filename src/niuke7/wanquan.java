package niuke7;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/15 15:28
 * @Version 1.0
 */
public class wanquan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int count=0;
            while ((n--)>1){
                int sum =0;
                for (int j =1; j <n ; j++) {
                    if (n%j==0){
                        sum+=j;
                    }
                }
                if (sum ==n){
                    count++;
                }
            }
            if (count!=0){
                System.out.println(count);
            }else
                System.out.println("-1");
        }
    }
}
