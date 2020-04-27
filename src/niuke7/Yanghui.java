package niuke7;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/15 15:17
 * @Version 1.0
 */
public class Yanghui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n<3){
                System.out.println("-1");
            }else if (n%2==1){
                System.out.println("2");
            }else if (n%4==0){
                System.out.println("3");
            }else {
                System.out.println("4");
            }
        }
        sc.close();
    }
}
