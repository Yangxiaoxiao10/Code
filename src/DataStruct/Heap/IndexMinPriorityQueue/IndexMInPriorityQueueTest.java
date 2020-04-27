package DataStruct.Heap.IndexMinPriorityQueue;

public class IndexMInPriorityQueueTest {
    public static void main(String[] args) {
        //创建索引优先队列
        IndexMInPriorityQueue<String> queue = new IndexMInPriorityQueue<>(10);
        //添加元素
        queue.insert(0,"A");
//        queue.insert(1,"B");
        queue.insert(1,"C");
//        queue.insert(3,"D");
//        queue.insert(4,"E");
        queue.insert(2,"F");
        //修改
        queue.changeItem(2,"B");
        //删除
        while (!queue.isEmpty()){
            int index =queue.delMin();
            System.out.println(index+" ");
        }
    }
}
