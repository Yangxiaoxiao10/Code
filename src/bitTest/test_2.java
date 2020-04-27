package bitTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author 杨晓晓
 * @Date 2020/4/18 13:49
 * @Version 1.0
 */
public class test_2 {
    public static void main(String[] args) {
        int[] input ={4,3,6,2,8,7,1,5};
        System.out.println(GetLeastNumbers_Solution(input,4));

    }
    public static  ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len = input.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len-i-1;j++){
                int temp;
                if(input[j]<input[j-1]){
                    temp =input[j];
                    input[j] = input[j-1];
                    input[j-1]= temp;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        Collections.sort(list);
        return list;
    }
}
