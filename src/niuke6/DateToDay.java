package niuke6;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/11 17:48
 * @Version 1.0
 */
public class DateToDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int year = sc.nextInt();
            int mon = sc.nextInt();
            int day = sc.nextInt();
//            int year = 2012;
//            int mon = 12;
//            int day = 21;
            System.out.println(getSum(year,mon,day));
        }
        sc.close();
    }
    public static int getSum(int year,int mon,int day){
        int [] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        int sum=0;
        if (checkYear(year)){
            //闰年
            Day[1] = 29;
        }
        if (check(mon,day)){
            return -1;
        }
        for(int i = 0 ; i < mon - 1 ; i ++){
            sum += Day[i] ;
        }
        return sum + day;
    }

    public static boolean check(int mon, int day){
        return  mon>=1&&mon<=12&&day>=1&&day<=31;
    }
    public static boolean checkYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
