package AMeituan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/23 19:00
 * @Version 1.0
 */
public class test1 {
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
                System.out.print(it);
            }
        }
    }
    public static ArrayList<Integer> getSimilar(int [] num){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            //相似为1
            int flag=1;
            for (int j = 0; j <num.length; j++) {
                //相似&=1;输出-1;
                if ((num[i]&num[j])!=0){
                    //如果相似的话，就继续找到不相似的
                    flag= -1;
//                    break;
                }else if((num[i]&num[j])==0){
                    //相直接跳出本轮循环
                    flag =1;
                    break;
                }
            }
            list.add(flag);

        }
        return list;
    }
}
