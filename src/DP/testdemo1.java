package DP;
import java.util.Scanner;
/**
 * @Author 杨晓晓
 * @Date 2020/3/23 16:34
 * @Version 1.0
 */

public class testdemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            if(num<=2){
                System.out.println(0);
            }
            int[] members=new int[num];//存储每一个数据元素
            int[] left_queue=new int[num];//数据元素从左到右对应的最大递增子序列数
            int[] right_queue=new int[num];//数据元素从右到左对应的最大递增子序列数
            for(int i=0;i<num;i++){//初始化各个数组数据
                members[i]=in.nextInt();
                left_queue[i]=1;
                right_queue[i]=1;
            }
            for(int i=0;i<num;i++){
                for(int j=0;j<i;j++){
                    if(members[i]>members[j]&&left_queue[j]+1>left_queue[i])
                        left_queue[i]=left_queue[j]+1;
                }
            }
            for(int i=num-1;i>=0;i--){
                for(int j=num-1;j>i;j--){
                    if(members[i]>members[j]&&right_queue[j]+1>right_queue[i])
                        right_queue[i]=right_queue[j]+1;
                }
            }
            int max=0;
            for(int i=0;i<num;i++){
                if(left_queue[i]+right_queue[i]>max)
                    max=left_queue[i]+right_queue[i];
            }
            System.out.println(num-max+1);
        }
    }
}
