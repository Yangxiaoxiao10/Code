package SwordOffer;

import java.util.ArrayList;

/**
 * @Author 杨晓晓
 * @Date 2020/4/21 1:12
 * @Version 1.0
 */
public class TwoSumS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array==null||array.length<2){
            return list;
        }
        int i =0,j=array.length-1;
        while (i<j){
            if (array[i]+array[j]==sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }else if (array[i]+array[j]>sum){
                j--;
            }else {
                i++;
            }
        }
        return list;
    }
}
