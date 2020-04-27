package niuke5;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author 杨晓晓
 * @Date 2020/4/2 13:48
 * @Version 1.0
 */
public class combineArrayInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            int m =sc.nextInt();
            for (int i = 0; i < m; i++) {
                set.add(sc.nextInt());
            }
            for (int temp :set) {
                System.out.print(temp);
            }
            System.out.println();
        }
        sc.close();
    }
}
