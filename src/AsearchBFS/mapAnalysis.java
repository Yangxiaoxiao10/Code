package AsearchBFS;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author 杨晓晓
 * @Date 2020/4/22 23:21
 * @Version 1.0
 */
//leetcode 地图解析
public class mapAnalysis {
    public static void main(String[] args) {

    }

    public int maxDistance(int[][] grid) {
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]==1){
                    //把坐标放入队列
                    queue.offer(new int[]{i,j});
                }
            }
        }
        //条件,全是陆地size=n*m -> 1，全是海洋,empty ->0;
        if (queue.size()==n*m||queue.isEmpty()){
            return -1;
        }
        //开始bfs
        int []point = null;
        while (!queue.isEmpty()){
            point = queue.poll();
            int x = point[0];
            int y = point[1];
            //四个方向迭代
            for (int i = 0; i < 4; i++) {
                int newX = x+dx[i];
                int newY = y+dy[i];
                //数组越界，或者值已经被标记过
                if (newX<0||newX>=n||newY<0||newY>=m||grid[newX][newY]!=0){
                    continue;
                }
                //没标记过，那就来标记,这里是核心做加法
                grid[newX][newY] = grid[x][y]+1;
                //把当前方向的坐标入队
                queue.offer(new int[]{newX,newY});
            }
        }
        return grid[point[0]][point[1]]-1;
    }
}
