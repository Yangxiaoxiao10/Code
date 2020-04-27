package niuke4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/26 15:29
 * @Version 1.0
 */
public class sortASCLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            System.out.println(ch);
        }
        sc.close();
    }
}
