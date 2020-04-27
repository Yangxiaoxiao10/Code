package AsearchBFS;

import sun.util.resources.cldr.kea.LocaleNames_kea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Author 杨晓晓
 * @Date 2020/4/25 14:30
 * @Version 1.0
 */
//01矩阵，和地图分析正好相反
public class leetcode542 {
    public static void main(String[] args) {

    }
    public int[][] updateMatrix(int[][] matrix) {
        int[] dx ={0,0,1,-1};
        int[] dy={1,-1,0,0};
        int n =matrix.length;
        int m =matrix[0].length;
        //不适用额外矩阵，就用matrix
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]==0){
                    queue.offer(new int[]{i,j});
                }else {
                    matrix[i][j]= -1;
                }
            }
        }
        while (!queue.isEmpty()){
            int[] point =queue.poll();
            int x = point[0];
            int y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX =x+dx[i];
                int newY =y+dy[i];
                if(newX>=0&& newX<n||newY>=0&& newY<m && matrix[newX][newY]==-1){
                    matrix[newX][newY]=matrix[x][y]+1;
                    queue.offer(new int[]{newX,newY});
                }
            }
        }
        return matrix;
    }

}
