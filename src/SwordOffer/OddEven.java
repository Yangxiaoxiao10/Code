package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 22:16
 * @Version 1.0
 */
public class OddEven {
    public static void main(String[] args) {
        int [] array={1,3,2,5,6,7,2};
        for (int i = 0,j = 1; i <array.length&&j<array.length-1 ; i++,j++) {
            //i,j指针，如果两个数奇偶性质不同，则
            if (array[i]%2==0){

            }
        }

    }
    public static void swap(int a,int b){
        int temp;
        temp = a;
        a =b;
        b =temp;
        return;
    }
}
