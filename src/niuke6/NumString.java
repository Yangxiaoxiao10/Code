package niuke6;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author 杨晓晓
 * @Date 2020/4/2 14:00
 * @Version 1.0
 */
public class NumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String reg = "\\D+";
            String[] sp = s.split(reg);
            String str ="";
            int max =0;
            for (String s1: sp) {
                max = s1.length()>max? s1.length():max;
            }
            for (String string: sp) {
                if (string.length()==max){
                    System.out.print(string);
                }
            }
            System.out.println(","+max);
        }

    }
}
