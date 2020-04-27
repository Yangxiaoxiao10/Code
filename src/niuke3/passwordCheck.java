package niuke3;

import java.util.Scanner;

public class passwordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(numCheck(str)&&lengthCheck(str)&&repeatCheck(str)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
    public static boolean lengthCheck(String str){
        int n = str.length();
        if(n<=8){
            return false;
        }else {
            return true;
        }
    }
    public static boolean numCheck(String str){
        int low =0, up=0,num=0,other=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='0'&&ch<='9'){
                num=1;
            }else if (ch>='a'&&ch<='z'){
                low =1;
            }else if(ch>='A'&&ch<='Z'){
                up = 1;
            }else {
                other = 1;
            }
        }
        if (low + num + up + other < 3){
            return false;
        }else {
            return  true;
        }
    }
    public static boolean repeatCheck(String str){
        for (int i = 0; i < str.length()-2; i++) {
            String substr1 =str.substring(i, i+3);
            if (str.substring(i+1).contains(substr1)){
                return false;
            }
        }
        return true;
    }
}
