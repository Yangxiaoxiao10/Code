package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author 杨晓晓
 * @Date 2020/4/25 12:16
 * @Version 1.0
 */
public class leetcode200_dfs {
    public static void main(String[] args) {

    }
    public static int numIslands(char[][] grid) {
        //dfs
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return  count;
    }
    public static void dfs(char[][] grid ,int i,int j){
        if (i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0') return;
        //遍历完做好标记
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
    public static int numIslands_bfs (char[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return  count;
    }
    public static void bfs(char[][] grid ,int i,int j){
        //queue存数组
        Queue<int[]> queue =new LinkedList<>();
        queue.offer(new int[] {i,j});
        while (!queue.isEmpty()){
            //出队，以便找到后面的值
            int[] point = queue.poll();
            i=point[0];
            j=point[1];
            //如果后续符合条件，就把当前值置0后继续遍历
            if (i>=0&&i<grid.length&& j>=0&& j<grid[0].length&&grid[i][j]=='1'){
                grid[i][j]='0';
                queue.offer(new int[]{i-1,j});
                queue.offer(new int[]{i+1,j});
                queue.offer(new int[]{i,j-1});
                queue.offer(new int[]{i,j+1});
            }
        }
    }
}
