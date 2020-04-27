package DP;

/**
 * @Author 杨晓晓
 * @Date 2020/4/8 13:03
 * @Version 1.0
 */
//最大时间调度
public class IntevalScheduling {
    //对数据预处理得到如下两数组，就是自己手画图，列表
    static int[] prev = new int[] {0,0,0,1,0,2,3,5};
    //存储每个任务所对应的价值
    static int[] v = new int[] {5,1,8,4,6,3,2,4};
    //比较两个整数的大小，并返回较大的整数
    public static int max(int a,int b) {
        if(a>=b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        int result = dp_opt();
        System.out.println(result);
    }
    public static int dp_opt() {
        int[] opt = new int[v.length+1];
        //opt数组，选择当前任务总和（包含以前可做任务）最大价值。
        //看着有点像背包算法。
        //初始值定义，opt[0]=0;opt[1]=v[0];
        opt[0] = 0;
        opt[1] = v[0];

        for(int i=1;i<opt.length;i++) {
            //就是选和不选的问题
//            int choice = v[i-1]+opt[prev[i-1]];
//            int notChoice = opt[i-1];
            //下面是转移方程，临界条件就是循环结束。
            opt[i] = max(v[i-1]+opt[prev[i-1]],opt[i-1]);
//            Math.max(v[i-1]+opt[prev[i-1]],opt[i-1]);
        }
        return opt[opt.length-1];
    }
}
