package DataStruct.Stack;

import java.util.Stack;

/**
 * @Author 杨晓晓
 * @Date 2020/4/17 21:02
 * @Version 1.0
 */
public class StackToQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public StackToQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void appendTail(int value) {
        s1.push(value);
    }
    public int deleteHead() {
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if (!s2.isEmpty()){
            return s2.pop();
        }else {
            return -1;
        }
//        return s2.pop();
    }
    public static void main(String[] args) {
        StackToQueue s = new StackToQueue();
        s.appendTail(0);
        s.appendTail(5);
        s.appendTail(4);
        s.appendTail(1);
        int top =s.deleteHead();
        System.out.println(top);
    }
}
