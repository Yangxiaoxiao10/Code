package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 23:17
 * @Version 1.0
 */
public class repeatNum {
    public static void main(String[] args) {

    }
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int[] num = new int[length];
        for(int i =0;i<num.length; i++){
//            int k =0;
            if(num[i]>1){
                duplication[0] = num[i];
                return true;
            }
            num[numbers[i]]+=1;
        }
        return false;
    }
}
