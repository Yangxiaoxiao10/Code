package bitTest;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/3 22:44
 * @Version 1.0
 */
public class test_1 {
    public static void main(String[] args) {
        //1的个数
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int k =0;
            int by = sc.nextInt();
            while (by!=0){
                by=by&(by<<1);
                k++;
            }
            System.out.println(k);
        }

    }
}
