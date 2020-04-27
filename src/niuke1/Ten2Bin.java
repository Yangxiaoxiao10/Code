package niuke1;

import java.util.Scanner;

public class Ten2Bin {
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
}
