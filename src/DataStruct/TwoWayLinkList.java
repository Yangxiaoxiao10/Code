package DataStruct;

import java.util.Iterator;
import java.util.function.ObjLongConsumer;

public class TwoWayLinkList<T> implements Iterable<T>{
    private Node head;
    private Node last;
    private int N;
    private class Node{
        private T item;
        private Node pre;
        private Node next;
        public Node(T item ,Node pre ,Node next){
            this.item=item;
            this.pre=pre;
            this.next=next;
        }
    }
    public TwoWayLinkList(){
        //构造函数，头结点，尾结点
        this.head= new Node(null,null,null);
        this.last=null;
        this.N=0;
    }
    public void clear(){
        //头结点后置空。尾节点空
        this.head.next=null;
        this.last=null;
        N=0;
    }
    public int length(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return head.next.item;
    }
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.item;
    }
    public void insert(T t){
        //空表
        if (isEmpty()){
            Node node= new Node(t,head,null);//有前驱指针
            last = node;
            head.next=last;//后继指针
        }else {
            //非空
            Node OldLast = last;//尾节点
            Node node = new Node(t, OldLast,null);//创建新节点
            OldLast.next=node;//尾节点指向新节点
            last=node;//新节点作为尾节点

        }
        N++;
    }
    public void insert(T t,int i){
        //找到i位置的前一个节点
        Node pre = head;
        for (int index=0;index<i;index++){
            pre = pre.next;
        }
        //当前节点
        Node cur = pre.next;
        //创建新节点
        Node newNode = new Node(t,pre,cur );//确定前驱后继
        //让i位置前一个节点的下一个节点变为新节点
        //确定pre的后继
        pre.next=newNode;
        //让i的前一个节点变为新节点
        //确定cur的前驱
        cur.pre=newNode;
        //数量加1
        N++;
    }
    public T get(int i){
        Node n = head.next;
        for (int index=0;index<i; index++){
            n=n.next;
        }
        return n.item;
    }
    //第一次出现的位置
    public int indexOf(T t){
        Node n = head;
        for (int i=0;n.next!=null;i++){
            n=n.next;
            if (n.next.equals(t)){
                return i;
            }
        }
        return -1;
    }
    public  T remove(int i){
        //找到i位置的前一个节点
        Node pre = head;
        for (int index=0;index<i;index++){
            pre = pre.next;
        }
        //找到i节点
        Node cur= pre.next;
        //找到i下一个结点
        Node nextNode = cur.next;
        //i的前一个结点的下个节点成为i的下一个节点
        pre.next= nextNode;
        //i的下一个节点的上一个节点变为i位置的前一个结点
        nextNode.pre= pre;
        //N-1
//        pre.next=pre.next.next;
//        pre.next.pre=pre;
        N--;
        return cur.item;
//        return pre.next.item;
    }
    @Override
    public Iterator<T> iterator() {//重写了Iterable接口
        return new TIterator();
    }
    private class TIterator implements Iterator{//重写Iterator接口
        private Node n;
        public TIterator(){
            this.n=head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
}
