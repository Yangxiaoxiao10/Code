package DataStruct;

import sun.security.krb5.internal.PAForUserEnc;

import java.security.PublicKey;
import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
    private Node head;
    private int N;

    private class Node{
        T item;
        Node next;
        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
    public LinkList(){
        this.head=new Node(null,null);
        this.N=0;
    }
    public void clear(){
        head.next=null;
        N=0;
    }
    public int length(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public T get(int i){
        //循环从头节点往后找，找i次
        Node n = head.next;
        for (int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }
    public void insert(T t){
        //找到当前最后一个，创建新节点，保存元素，将当前最后一个结点指向新节点
        Node n= head;
        while (n.next!=null){
            n=n.next;
        }
        Node newNode = new Node(t,null);
        n.next=newNode;
        N++;
    }
    public void insert(T t,int i){
        //找到i的前一个节点，从头节点遍历i次（头节点1加上i-1次节点，找到i）
        Node pre = head;
        for(int index=0;index<=i-1;i++){
            pre=pre.next;
        }
        Node cur = pre.next;//当前i位置的节点
        Node newNode = new Node(t,cur);//新节点指向i位置
        pre.next = newNode;//断掉原来的链接，指向新的链接
        N++;
    }
    public T remove(int i){//删除i节点，找到i位置的前一个节点
        Node pre = head;
        for(int index=0;index<=i-1;i++){
            pre=pre.next;
        }
        //找到i位置的节点
        Node cur = pre.next;
        //找到i位置的下一个节点
        Node nextNode= cur.next;
        //让前一个节点，指向后一个节点
        pre.next = nextNode;
        //元素—1
        N--;
        return cur.item;
    }
    //第一次出现的位置
    public int indexOf(T t){
        //从头节点开始，遍历节点的item和t对比
        Node n =head;
        for (int i=0;n.next!=null;i++){
            n=n.next;
            if(n.item.equals(t)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public Iterator<T> iterator() {//需要返回一个iterator，写个内部类iterator接口
         return new LIterator();//调用它自己的hasnext，next方法
    }
    private class LIterator implements Iterator{
        private Node n;
        public LIterator(){//空参构造,初始化指向头节点，为遍历做准备
            this.n= head;
        }
        @Override
        public boolean hasNext() {//判断最后一个是否还有
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
    public void reverse(){
        //判断是否为空
        if (isEmpty()){
            return;
        }
        reverse(head.next);
    }
    public Node reverse(Node cur){
        if (cur.next==null){
            head.next=cur;
            return cur;
        }
        //cur.next=3,pre就是本该在它后面的4
        Node pre =reverse(cur.next);
        pre.next= cur;
        cur.next= null;
        return cur;
    }
}
