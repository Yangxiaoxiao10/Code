package niuke1;
import java.util.*;
public class CoorMove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.nextLine();
            String[] str = string.split(";");
            int x=0,y=0;
            for(int i=0;i<str.length;i++){
                if(judgeString(str[i])){
                    if(str[i].charAt(0)=='A'){
                        x=x-Integer.parseInt(str[i].substring(1));
                    }else if (str[i].charAt(0)=='D'){
                        x=x+Integer.parseInt(str[i].substring(1));
                    }else if(str[i].charAt(0)=='W'){
                        y=y+Integer.parseInt(str[i].substring(1));
                    }else if(str[i].charAt(0)=='S'){
                        y=y-Integer.parseInt(str[i].substring(1));
                    }
                }
            }
            System.out.println(x+","+y);
        }
        sc.close();
    }

    public static boolean judgeString(String str){
        int n = str.length();
        if(n<=3&&n>1){
            if(str.charAt(0)=='A'||str.charAt(0)=='D'||
                    str.charAt(0)=='W'||str.charAt(0)=='S'){
                if(n==2&&Character.isDigit(str.charAt(1))){
                    return true;
                }else if (n==3&&Character.isDigit(str.charAt(1))&&Character.isDigit(str.charAt(2))){
                    return true;
                }
            }
        }
        return false;
    }
}