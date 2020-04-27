package AMeituan;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/23 20:00
 * @Version 1.0
 */
public class test2 {
    private static int[][] dir ={{0,1},{0,-1},{1,0},{-1,0}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            Queue<int[]> queue = new ArrayDeque<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                queue.offer(new int[]{sc.nextInt(),sc.nextInt()});
            }
        }
    }
    public static int getNum(){
        return 0;
    }
}
