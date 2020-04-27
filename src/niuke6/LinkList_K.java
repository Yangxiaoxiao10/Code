package niuke6;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/2 23:35
 * @Version 1.0
 */
public class LinkList_K {
    static class ListNode{
        public int data;
        public ListNode  next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            ListNode node = new ListNode();
            node.next = null;
            for (int i = 0; i < n; i++) {
                ListNode p = new ListNode();
                int x = sc.nextInt();
                //链表头插法，每次加元素，都紧接着插在头结点后面，
                //node->新结点->p1->p2->p3->p4->null;
                p.next = node.next;
                p.data = x;
                node.next = p;
            }
            //这样输入的表数据，和实际存的是倒序，正序遍历直接找k个
            int k = sc.nextInt();
            ListNode kthNode = getKthNode(node, k);
            System.out.println(kthNode.data);
        }
    }
    public static ListNode getKthNode(ListNode node,int k){
        ListNode front = node, behind = node;
        //接收传入的头结点
        int x =0;
        //0对应头结点
        while (x<k && front.next!=null){
            x++;
            front = front.next;
            //x对于结点顺序
        }
        //对应第k个结点
        return front;
    }
}
