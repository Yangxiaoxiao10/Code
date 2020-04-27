package Sort;

import java.util.ArrayList;

/**
 * @Author 杨晓晓
 * @Date 2020/4/18 15:07
 * @Version 1.0
 */
public class test_bubble {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len = input.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            int temp;
            for(int j=0;j<len-i-1;j++){
                if(input[j]<input[j+1]){
                    temp =input[j];
                    input[j] = input[j+1];
                    input[j+1]= temp;
                }
                list.add(input[input.length-i-1]);
            }
        }
        return list;
    }
}
