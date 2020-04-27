package niuke4;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 21:37
 * @Version 1.0
 */
public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取数量n和n行字符串
        while (sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                if (s.length()%8!=0){
                    s+="00000000";
                    //s =abc00000
                    //s =12345678 90000000
                }
                while (s.length()>=8){
                    //打印8位
                    System.out.println(s.substring(0,8));
                    s= s.substring(8);
                }
            }
        }
        sc.close();
    }
}
