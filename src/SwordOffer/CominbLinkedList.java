package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 20:18
 * @Version 1.0
 */
public class CominbLinkedList {

    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
        this.val = val;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head =new ListNode(-1);
        head.next=null;
        ListNode root = head;
        //head作为移动指针，root作为头结点
        while (list1!=null&&list2!=null){
            if (list1.val<list2.val){
                head.next = list1;
                //后移head和list1位置
                head =list1;
                list1 = list1.next;
            }else {
                head.next = list2;
                //后移head和list1位置
                head = list2;
                list2 = list2.next;
            }
        }
        if (list1!=null){
            head.next =list1;
        }
        if (list2!=null){
            head.next = list2;
        }
        return root.next;
    }
}
