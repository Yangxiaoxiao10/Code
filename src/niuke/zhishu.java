package niuke;

import java.util.Scanner;

public class zhishu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        System.out.println(getResult(s));
    }
    public static String getResult(long s){
        int a =2;
        String result ="";
        while(s!=1){
            while(s%a==0){
                s=s/a;
                result=result+a+" ";
            }
            a++;
        }
        return result;
    }
}
