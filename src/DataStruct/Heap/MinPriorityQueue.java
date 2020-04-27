package DataStruct.Heap;
//最大优先队列
public class MinPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int N;
    public MinPriorityQueue(int capacity){
        this.items = (T[])new Comparable[capacity+1];
        this.N=0;
    }
    //长度
    public int size(){
        return N;
    }
    //判空
    public boolean isEmpty(){
        return N==0;
    }
    //判断i是否小于j索引值
    private boolean less(int i, int j){
        return items[i].compareTo(items[j])<0;
    }
    //交换i和j索引处的值
    private void exch(int i,int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
    //插入上浮
    public void insert(T t){
        items[++N] = t;
        swim(N);
    }
    //删除运算
    public T delMin(){
        T min = items[1];
        exch(1,N);
        N--;
        //调整顺序，下沉1
        sink(1);
        return min;
    }
    //上浮运算
    public void swim(int k){
        while (k>1){
            if (less(k,k/2)){
                //当前结点，小于父节点，要把小的往前放
                exch(k,k/2);
            }
            k = k/2;
        }
    }
    //下沉运算
    public void sink(int k){
        while (2*k<=N){
            int min;
            if(2*k+1<=N){
                if (less(2*k,2*k+1)){
                    min = 2*k;
                }else {
                    min =2*k+1;
                }
            }else {
                min =2*k;
            }
            if (less(k,min)){//位置合适
                break;
            }
            exch(k,min);
            k = min;//这个地方一定要懂，让k继续循环，k可能是最后一层非子结点，也会是上一层的结点
        }
    }





}
