package leetcode;

/**
 * @Author 杨晓晓
 * @Date 2020/4/25 13:03
 * @Version 1.0
 */
public class leetcode463 {
    public static void main(String[] args) {

    }
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1){
                    return dfs(grid,i,j);
                }
            }
        }
        return  0;
    }
    public static int dfs(int[][] grid ,int i,int j){
        //碰到边界+1
        if (i<0||i>grid.length||j<0||j>grid[0].length){
            return 1;
        }
        //碰到海洋+1
        if (grid[i][j]==0){
            return 1;
        }
        //已经遍历过的格子不算入
        if (grid[i][j]!=1){
            return 0;
        }
        //遍历完要标记为2
        grid[i][j] = 2;
        return dfs(grid,i+1,j)+dfs(grid,i-1,j)+dfs(grid,i,j+1)+dfs(grid,i,j-1);
    }
}
