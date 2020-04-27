package niuke7;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/13 17:35
 * @Version 1.0
 */
public class insertStringIndex {
    public static void main(String[] args) {
        int []a ={1,3,4,5,7};
        int b =2;
        System.out.println(getIndex(a,b));

    }
    private   static int getIndex(int []a, int target){
        //二分
        int low =0;
        int high = a.length-1;
        //最后会锁定两个字母low,high，
        // mid必然是左边那位数
        //如果target大于mid，返回low=mid+1，即可
        //target小于mid，返回当前low就行，即插入值（新low）+旧low（mid）+high
        while (low<=high){
            int mid = (low+high)/2;
            if (a[mid]==target){
                return mid;
            }else if (a[mid]>target){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
}
