package AMeituan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/23 19:00
 * @Version 1.0
 */
public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
//            int []num ={3,5,6,1};
            ArrayList<Integer>list = getSimilar(num);
            for (int it:list) {
                System.out.print(it+" ");
            }
        }
    }
    public static ArrayList<Integer> getSimilar(int [] num){
        ArrayList<Integer> list = new ArrayList<>();
        int[] n = new int[num.length];
        int j=num.length-1;
        for (int k = 0; k < num.length; k++) {
            while ((num[k]&num[j])==1&& k<j){
                j--;
            }
            num[j] =1;
        }
        return list;
    }
}
