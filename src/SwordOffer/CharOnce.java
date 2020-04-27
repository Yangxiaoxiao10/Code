package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/18 20:30
 * @Version 1.0
 */
public class CharOnce {
    public static void main(String[] args) {

    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length==2){
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int bitFirst = 0;
        for (int i = 0; i < array.length; i++) {
            bitFirst^=array[i];
        }

        int index = LastIndexOf1(bitFirst);
        //根据某个1的index位置，分成两个数组
        for (int i = 0; i < array.length; i++) {
            if (isBit1(array[i],index)){
                //对于array中index处为1的数字，循环异或操作
                //不必考虑中间过程，因为最后必定是只有一个数num
                //其余都是成对，
                num1[0] ^=array[i];
            }else {
                num2[0] ^=array[i];
            }
        }

    }
    public static int LastIndexOf1(int bitFirst){
        int index =0;
        while ((bitFirst&1)==0&& index<32){
            bitFirst>>=1;
            index++;
        }
        return index;
    }
    public static boolean isBit1(int target,int index){
        return ((target>>index)&1)==1;
    }
}
