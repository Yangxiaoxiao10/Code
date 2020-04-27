package niuke4;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/26 23:59
 * @Version 1.0
 */
public class Fibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(fib(n));
        }
    }
    public static int fib(int n){
        int p[] = new int[n+1];
        p[0] = 0;
        p[1] = 1;
        for (int i = 2; i <=n ; i++) {
            p[i]= p[i-1]+ p[i-2];
        }
        return p[n];
    }
}
