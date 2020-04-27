package niuke7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 14:32
 * @Version 1.0
 */
public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int []num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }

            Arrays.sort(num);
            int iSortFlag = sc.nextInt();
            if (iSortFlag==0){
                for (int i = 0; i < num.length; i++) {
                    System.out.println(num[i]+" ");
                }
            }
            if (iSortFlag==1){
                for (int i = num.length-1; i >= 0; i--) {
                    System.out.println(num[i]+" ");
                }
            }
            System.out.println();
        }
    }
}
