package DP;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/22 23:09
 * @Version 1.0
 */
/*
链接：https://www.nowcoder.com/questionTerminal/6d9d69e3898f45169a441632b325c7b4?f=discussion
来源：牛客网

首先计算每个数在最大递增子串中的位置
186  186  150  200  160  130  197  200   quene
1      1      1      2       2      1      3     4       递增计数

然后计算每个数在反向最大递减子串中的位置--->计算反向后每个数在最大递增子串中的位置
200  197  130  160  200  150  186  186   反向quene
1    1    1     2    3    2    3    3      递减计数

然后将每个数的递增计数和递减计数相加
186  186  150  200  160  130  197  200   quene
1      1      1      2       2     1      3      4       递增计数
3      3      2      3       2     1      1      1       递减计数
4      4      3      5       4     2      4      5       每个数在所在队列的人数+1（自己在递增和递减中被重复计算）

如160这个数

在递增队列中有2个人数
150  160
在递减队列中有2个人数
160  130
那么160所在队列中就有3个人
150  160  130

每个数的所在队列人数表达就是这个意思
总人数 - 该数所在队列人数 = 需要出队的人数
 */
public class LargeestListFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            if (num<=2){
                System.out.println(0);
            }
            //初始化原数组和两个辅助数组
            //辅助数组负责计数当前元素为尾元素，在递增子序列中的位置，初始值为1
            int[] members = new int[num];
            int[] left = new int[num];
            int[] right = new int[num];
            for (int i = 0; i < num; i++) {
                members[i]= sc.nextInt();
                left[i]=1;
                right[i]=1;
            }
            //开始构建左边递增子序列，判断条件，左边比右边小，并且左边元素出现在序列中的位置+1后，
            //比右边元素大，【右边数组第一次出现】
            for (int i = 0; i < num; i++) {
                for (int j = 0;j < i;j++){
                    if (members[j]<members[i]&&left[j]+1>left[i]){
                        left[i] = left[j]+1;
                    }
                }
            }
            //构建右边递增子序列
            for (int i = num-1;i>=0;i--){
                for (int j =num-1;j>i;j--){
                    if (members[i]>members[j]&&right[j]+1<right[i]){
                        right[i] = right[j]+1;
                    }
                }
            }
            int max = 0;
            for (int i =0;i <num;i++){
                if (right[i]+left[i]>max){
                    max = right[i]+left[i];
                }
            }
            System.out.println(num-max+1);
        }
    }
}