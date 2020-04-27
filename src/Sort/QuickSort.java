package Sort;

/**
 * @Author 杨晓晓
 * @Date 2020/4/4 20:00
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int []arr={10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr,0,arr.length-1);

        for (int i: arr) {
            System.out.print(i+",");
        }
    }
    public static void quickSort(int []arr,int low,int high){
        if (low> high){
            return;
        }
        int i ,j, temp,t;
        i = low;
        j = high;
        temp = arr[low];
        while (i<j){
            while (temp<=arr[j]&&i<j){
                j--;
            }
            while (temp >= arr[i]&&i<j){
                i++;
            }
            if (i<j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
             }
        }
        //i=j,交换基准数值，和ij对应的值
        arr[low]= arr[i];
        arr[i] = temp;
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }
}
