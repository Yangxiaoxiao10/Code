package bitTest;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/3 23:11
 * @Version 1.0
 */
public class hammingWeight {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String s = Integer.toBinaryString(n);
            int count=0;
            for (; n!=0 ;n = n>>>1) {
                if ((n&1)==1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

/*
* import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Ten2Bin(n));
    }
    public static int Ten2Bin(int n){
        String s = Integer.toBinaryString(n);
        int count =0;
        for (int i=0;i<s.length();i++){
            if (Integer.parseInt(s.substring(i,i+1))==1){
                count++;
            }
        }
        return count;
    }
}*/