package ATX;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/26 19:58
 * @Version 1.0
 */
public class main0 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(getDeep(a));
    }
    public static int getDeep(int node){
        int count=1;
        while (node!=1){
            node/=2;
            count++;
        }
        return count;
    }
}
