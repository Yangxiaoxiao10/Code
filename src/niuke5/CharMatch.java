package niuke5;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/28 15:07
 * @Version 1.0
 */
public class CharMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w:while (sc.hasNext()){
            String sh = sc.nextLine();
            String lo = sc.nextLine();
            for (int j = 0; j <sh.length() ; j++) {
                if (!lo.contains(String.valueOf(sh.charAt(j)))){
                    System.out.println("false");
                    continue w;
                }
            }
            System.out.println("true");
        }
    }
}
