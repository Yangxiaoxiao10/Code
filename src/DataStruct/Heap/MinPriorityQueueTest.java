package DataStruct.Heap;

public class MinPriorityQueueTest {
    public static void main(String[] args) {
        //创建优先队列
        MinPriorityQueue<String> queue = new MinPriorityQueue<String>(10);
        // 加入元素
        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");
//        queue.insert("H");

        //获取元素
        while (!queue.isEmpty()){
            String min = queue.delMin();
            System.out.print(min+" ");
        }
    }
}
