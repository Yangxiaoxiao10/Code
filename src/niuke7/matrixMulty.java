package niuke7;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/15 0:17
 * @Version 1.0
 */
public class matrixMulty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int[][] XY = new int[x][y];
            int[][] YZ = new int[y][z];
            int[][] XZ = new int[x][z];
            for (int i = 0; i <x ; i++) {
                for (int j = 0; j < y; j++) {
                    XY[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i <y ; i++) {
                for (int j = 0; j < z; j++) {
                    YZ[i][j] = sc.nextInt();
                }
            }
            XZ = getMatrixRes(x,y,z,XY,YZ);
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < z; j++) {
                    System.out.print(XZ[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public  static  int[][] getMatrixRes(int x,int y,int z,int[][] XY,int[][] YZ){
        int[][] XZ= new int[x][z];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                for (int k = 0; k < y; k++) {
                    XZ[i][j]= XZ[i][j]+XY[i][k]*YZ[k][j];
                }
            }
        }
        return XZ;
    }
}
