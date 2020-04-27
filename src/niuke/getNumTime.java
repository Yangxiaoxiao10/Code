package niuke;

import java.util.Scanner;

public class getNumTime {
    public static void getNum(String s1,String s2){
        int count =0;
        for(int i=0;i<s1.length();i++){
            if(s1.substring(i,i+1).equalsIgnoreCase(s2)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("输入字符串：");
        String s1 = in.nextLine();
        System.out.println("输入字符：");
        String s2 = in.nextLine();
        getNum(s1,s2);
    }
}
