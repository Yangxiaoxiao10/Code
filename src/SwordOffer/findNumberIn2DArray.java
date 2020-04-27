package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/17 22:13
 * @Version 1.0
 */
public class findNumberIn2DArray{
    public static void main(String[] args) {

    }
    public boolean findNumIn2DArray(int[][] matrix, int target) {
        int i = matrix.length-1;
        int line = matrix[0].length;
        int j=0;
        while (i>=0&&j<line){
            if (target>matrix[i][j]) {
                j++;
            }else if (target<matrix[i][j]){
                i--;
            }else {
                return true;
            }
        }
        return false;
    }
}
