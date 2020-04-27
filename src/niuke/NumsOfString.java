package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int [] str =new int[128];
        for (int i=0;i<s.length();i++){
            str[s.charAt(i)]=1;
        }
//        List<String> list = new ArrayList<>();
//        int a = s.length();
        int count=0;
        for (int i=0;i<str.length;i++){
            if(str[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
