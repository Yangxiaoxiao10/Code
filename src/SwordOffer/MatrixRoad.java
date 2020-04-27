package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 1:16
 * @Version 1.0
 */
public class MatrixRoad {
    public static void main(String[] args) {

    }
    public static boolean exist(char[][] board, String word){
        //两个for循环是M*N复杂度，dfs是3^k复杂度，最多是O(M*N*3^k)
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (bfs(board,words,i,j,0)) return  true;
            }
        }
        return false;
    }
    public  static boolean bfs(char[][] board,char[] words ,int i,int j, int k){
        //健壮性判断，排除路径,数组越界,board[i][j]!=words[k]这步最关键，匹配操作在此
        // 数组元素后移也是看这里
        if (i>=board.length||i<0||j>=board[0].length||j<0||board[i][j]!=words[k])
            return false;
        //结束条件，匹配完word
        if (k==words.length-1) return true;
        //temp和‘/’标记，代替visited[][]数组的true/false判断
        char temp = board[i][j];
        board[i][j] ='/';
        boolean res = bfs(board,words,i+1,j,k+1)||bfs(board,words,i-1,j,k+1)||
                bfs(board,words,i,j-1,k+1)||bfs(board,words,i,j+1,k+1);
        //匹配失败或者成功后，要解除“回头路”标记，因为外面两个for循环还要用这些数据
        board[i][j] =temp;
        return res;
    }

}
