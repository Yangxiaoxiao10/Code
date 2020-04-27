package DataStruct.Heap;

public class MaxPriorityQueueTest {
    public static void main(String[] args) {
        //创建优先队列
        MaxPriorityQueue<String> queue = new MaxPriorityQueue<String>(10);
        // 加入元素
        queue.insert("A");
        queue.insert("B");
        queue.insert("C");
        queue.insert("D");
        queue.insert("E");
        queue.insert("F");
        queue.insert("G");
//        queue.insert("H");

        //获取元素
        while (!queue.isEmpty()){
            String max = queue.delMax();
            System.out.print(max+" ");
        }
    }
}
