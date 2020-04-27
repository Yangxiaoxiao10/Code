package SwordOffer;

import java.util.Stack;

/**
 * @Author 杨晓晓
 * @Date 2020/4/17 22:40
 * @Version 1.0
 */
public class ReversePrint {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
          }
  }
    public static void main(String[] args) {

    }
    public int[] reversePrint(ListNode head) {
          //放入栈中
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        //错误，不可以将stack.size()作为哦边界，因为他是变化的
        int [] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }
    public int[] reversePrint1(ListNode head){
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }
}
