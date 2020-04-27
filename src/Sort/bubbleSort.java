package Sort;

/**
 * @Author 杨晓晓
 * @Date 2020/4/4 20:17
 * @Version 1.0
 */
public class bubbleSort {
    public static void main(String[] args) {
        int []arr = {10,4,7,62,3,4,2,1,8,9,19};
        Sort(arr);
        for (int i:arr) {
            System.out.print(i+",");
        }
    }
    public static void Sort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            int temp=0;
            for (int j = 1; j < len-i-1; j++) {
                if (arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
    }
}
