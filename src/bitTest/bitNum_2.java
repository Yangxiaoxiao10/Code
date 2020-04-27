package bitTest;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/4 23:31
 * @Version 1.0
 */
public class bitNum_2 {
    //最长的 连续1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int k=0;
            int i = sc.nextInt();
            while (i!=0){
                i = i &(i<<1);
                k++;
            }
            System.out.println(k);
        }
    }
}
