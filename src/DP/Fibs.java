package DP;

/**
 * @Author 杨晓晓
 * @Date 2020/3/21 0:42
 * @Version 1.0
 */
public class Fibs {
    public static void main(String[] args) {
//        int count=0;
        System.out.println("f(8)="+f(8));
//        for (int i=1;i<=8;i++){
//            System.out.println(f(i));
//        }
//        System.out.println("count="+count);
    }
    public static int f(int n){
        int[] p = new int [n+1];
        p[0]=0;
        p[1]=1;
        for (int i=2;i<n+1;i++){
            p[i] = p[i-1]+p[i-2];
        }
        return p[n];
    }
}
