package SwordOffer;
import java.util.Stack;
/**
 * @Author 杨晓晓
 * @Date 2020/4/20 23:55
 * @Version 1.0
 */
public class StackMin {
     Stack<Integer> s = new Stack<>();
     Stack<Integer> sMin = new Stack<>();
    public static void main(String[] args) {

    }
    public void push(int node) {
        s.push(node);
        if (sMin.isEmpty()){
            sMin.push(node);
        }else if (node<=sMin.peek()){
            sMin.push(node);
        }
        //其余情况的话，就是node值比当前的大，sMin不操作
    }

    public void pop() {
        if (s.isEmpty()){
            throw new RuntimeException("This stack is empty");
        }
        if (s.peek()==sMin.peek()){
            sMin.pop();
        }
        s.pop();
    }

    public int top() {
        if (s.isEmpty()){
            throw new RuntimeException("This stack is empty");
        }
        return s.peek();
    }

    public int min() {
        if (sMin.isEmpty()){
            throw new RuntimeException("This stack is empty");
        }
        return sMin.peek();
    }
}
