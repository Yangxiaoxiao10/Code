package niuke;

import java.util.Scanner;

public class StrQuery {
    //数组置为0，然后获得输入数字，放入对应位置，置为1
    public static int[] getQuery(int[] a){
        int []b = new int[1000];
        for (int i=0;i<b.length;i++){
            b[i]=0;
        }
        int len = a.length;
        for (int i=0;i<len;i++){
            b[a[i]]=1;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] a= new int[n];
            for (int i=0;i<a.length;i++){
                a[i]= sc.nextInt();
            }
            int [] c= getQuery(a);
            int len = c.length;
            for (int i=0;i<len;i++){
                if(c[i]==1){
                    System.out.println(i);
                }
            }
        }
    }
}
