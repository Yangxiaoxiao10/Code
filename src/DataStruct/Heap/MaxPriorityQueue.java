package DataStruct.Heap;
//最大优先队列
public class MaxPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int N;
    public  MaxPriorityQueue(int capacity){
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
    public void insert(T t){
        items[++N] = t;
        swim(N);
    }
    //删除运算
    public T delMax(){
        T max = items[1];
        exch(1,N);
        N--;
        //调整顺序，下沉1
        sink(1);
        return max;
    }
    //上浮运算
    public void swim(int k){
        while (k>1){
            if (less(k/2,k)){
                //父节点<当前，则交换
                exch(k/2,k);
            }
            k = k/2;
        }
    }
    //下沉运算
    public void sink(int k){
        while (2*k<=N){
            int max;
            if(2*k+1<=N){
                if (less(2*k,2*k+1)){
                    max = 2*k+1;
                }else {
                    max =2*k;
                }
            }else {
                max =2*k;
            }
            if (!less(k,max)){
                break;
            }
            exch(k,max);
            k = max;//这个地方一定要懂，让k继续循环，k可能是最后一层非子结点，也会是上一层的结点
        }
    }





}
