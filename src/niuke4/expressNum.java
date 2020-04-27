package niuke4;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 21:59
 * @Version 1.0
 */
public class expressNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char ch :chars) {
                if (ch>='0'&&ch <='9'){
                    sb.append("*"+ch+"*");
                }else {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString().replace("**",""));
        }
    }
}
