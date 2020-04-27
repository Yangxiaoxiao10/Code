package DataStruct.Stack;

import java.util.Stack;

/**
 * @Author 杨晓晓
 * @Date 2020/4/17 21:48
 * @Version 1.0
 */
public class StackLegal {

    public static void main(String[] args) {
        int [] Input={1,2,3,4,5};//入栈序列
        int [] Output1={4,5,3,2,1};//出现序列1
        int [] Output2={4,3,5,1,2};//出栈序列2
        System.out.println(IsPopOrder(Input,Output1));
        System.out.println(IsPopOrder(Input,Output2));

    }
    public static boolean IsPopOrder(int[] a,int[] b){
        if (a.length!=b.length) return false;
//        if (a.length==0||b.length==0) return false;
        Stack<Integer> s = new Stack<>();
        int j=0;
        //先把a元素挨个压栈，当栈顶元素等于b数组的首元素，s出栈，j后移
        for (int i = 0; i < b.length; i++) {
            s.push(a[i]);
            while (j<b.length && s.peek()==b[j]){
                s.pop();
                j++;
            }
        }
        //最后判空s
        return s.size()==0;
    }
}
