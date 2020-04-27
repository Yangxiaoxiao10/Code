package Alibaba;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/20 19:00
 * @Version 1.0
 */
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int able = sc.nextInt();
            int numOfmonster= sc.nextInt();
            int []monster = new int[numOfmonster];
//            int money =0;
            System.out.println(HowMuchMoney(able,monster));
        }
    }
    public static int HowMuchMoney(int able,int[] mons){
        Arrays.sort(mons);
        boolean win= false;
        int money =0;
        for (int i = 0; i < mons.length; i++) {
            if (able>=mons[i]){
                able++;
                money+=1;
                win = true;
            }else{
                win = false;
            }
        }
        return 0;
    }
}
