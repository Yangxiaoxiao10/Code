package niuke5;

import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/3/30 0:13
 * @Version 1.0
 */

//排序后，前k个整数
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            while (n>0){
                list.add(sc.nextInt());
                n--;
            }
            Collections.sort(list);
            for (int i = 0; i < k; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println(" ");
        }
    }
}
