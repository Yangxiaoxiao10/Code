package leetcode;

/**
 * @Author 杨晓晓
 * @Date 2020/4/25 12:53
 * @Version 1.0
 */
//最大岛屿问题
public class leetcode695 {
    public static void main(String[] args) {

    }
    public int maxAreaOfIsland(int[][] grid) {
        int res =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1){
                    int a = dfs(grid,i,j);
                    res =Math.max(res,a);
                }
            }
        }
        return res;
    }
    public static int  dfs(int[][]grid,int i,int j){
        if (i<0||i>=grid.length||j<0||j>=grid[0].length){
            return 0;
        }
        if (grid[i][j]!=1){
            return 0;
        }
        //遍历结束标记为2
        grid[i][j] =2;
        return 1+dfs(grid,i+1,j)+dfs(grid,i-1,j)+dfs(grid,i,j-1)+dfs(grid,i,j+1);
    }
}
