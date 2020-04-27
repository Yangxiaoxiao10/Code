package niuke7;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 15:37
 * @Version 1.0
 */
public class zishou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(CalcAutomorphicNumbers(n));
        }
    }
    public static int CalcAutomorphicNumbers( int n)
    {
        /*在这里实现功能*/
        int count=0;
        for (int i = 0; i <=n ; i++) {
            long N = i*i;
            if (String.valueOf(N).endsWith(String.valueOf(i))){
                count++;
            }
        }
        return count;
    }
}
