import javax.print.DocFlavor;

public class ZeroOnePack {
    public static void main(String[] args) {
        int N = 6;
        int C = 16;//最大容量
        int[] w ={0,2,3,5,6,7};//重量
        int [] v ={0,1,2,3,4,7};//价值
        int [][] table= new int[N][C];
        for (int i=1;i<N;i++){
            for(int j=1;j<C;j++) {
                if (j < w[i]) {//判断能不能偷，
                    table[i][j] = table[i-1][j];
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        System.out.println("总价值为"+table[5][15]);
        int j=C-1;//真实容量
        String str = " ";
        for(int i =N-1;i>0;i--){
            if(table[i][j]>table[i-1][j]){//装了比不装多，说明装了i
                str= i+"号"+str;
                j=j-w[i]; //减去确定装入的这个物品
            }
            if(j==0){
                break;
            }
        }
        System.out.println("装入的物品是"+str);
    }
}
