package AsearchDFS;

/**
 * @Author 杨晓晓
 * @Date 2020/4/23 0:54
 * @Version 1.0
 */
public class MatrixIncreaseLongestPath {
    public static void main(String[] args) {

    }
    private static int[][] dirs ={{0,1},{0,-1},{1,0},{-1,0}};
    private static int n ,m;

    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        int res=0;
        int [][]cache = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //记录从每个点开始的最长的路径
                res = Math.max(res,dfs(matrix,i,j,cache));
            }
        }
        return res;
    }
    public static int dfs(int[][] matrix,int i,int j,int[][] cache ){
        //记忆化搜索
        if (cache[i][j]!=0){
            return  cache[i][j];
        }
        //四个方向查找，符合递增条件，就更新递增结点的对应值，怎么更新的，
        for (int [] d: dirs) {
            int newX = d[0]+i;
            int newY = d[1]+j;
            if (0<=newX && newX<n && 0<=newY && newY<m && matrix[i][j]<matrix[newX][newY]){
                //更新cache值,存的是距离值，
                cache[i][j] = Math.max(cache[i][j],dfs(matrix,newX,newY,cache));
            }
        }
        return ++cache[i][j];
    }
}
