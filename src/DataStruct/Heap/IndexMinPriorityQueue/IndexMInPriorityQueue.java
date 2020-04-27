package DataStruct.Heap.IndexMinPriorityQueue;

public class IndexMInPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int[] pq;
    private int[] qp;
    private int N;
    //构造函数
    public IndexMInPriorityQueue(int capacity){
        this.items = (T[])new Comparable[capacity+1];
        this.pq= new int[capacity+1];
        this.qp =new int[capacity+1];
        this.N = 0;
        for (int i = 0; i < qp.length; i++) {
            qp[i]=-1;
        }
    }
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    private boolean less(int i,int j){
        return items[pq[i]].compareTo(items[pq[j]])<0;
    }
    public void exch(int i,int j){
        //交换pq的数据
        int temp = pq[i];
        pq[i]= pq[j];
        pq[j]=temp;
        //更新qp的数据
         qp[pq[i]]=i;
         qp[pq[j]]=i;
    }
    public boolean contains(int k){
        //存在
        return qp[k]!=-1;
    }
    //  最小元素的索引
    public int minIndex(){
        return pq[1];
    }
    //插入
    public void insert(int i,T t){
        //如果已经被关联，就不用插入
        if(contains(i)){
            return;
        }else {
            //元素加1
            N++;
            //存到item，
            items[i]=t;
            // t 存到pq。
            pq[N]=i;
            // 记录在qp
            qp[i]= N;
            //开始调整
            swim(N);
        }
    }
    //删除最小元素，返回元素关联索引
    public int  delMin(){
        //获取最小元素关联的索引
        int minIndex = pq[1];
        //交换索引1和最大索引元素
        exch(1,N);
        //删除qp中的对应内容
        qp[pq[N]]= -1;
        //删除pq最大索引 （最小值放过去了）
        pq[N]=-1;
        //s删除items中对应的内容
        items[minIndex]=null;
        //元素-1
        N--;
        //下沉
        sink(1);
        return minIndex;
    }
    public void delIndex(int i){
        //找到i在pq的索引
        int k = qp[i];
        //交换元素
        exch(k,N);
        //删除qp元素
        qp[pq[N]]=-1;
        //删除pq元素
        pq[N]=-1;
        //删除items元素
        items[k]=null;
        //N-
        N--;
        //调整
        swim(k);
        sink(k);
    }
    //修改i处的元素为t
    public void changeItem(int i ,T t){
        //修改i位置元素为t
        items[i]=t;
        //找到i在pq的位置
        int k = qp[i];
        //堆调整
        swim(k);
        sink(k);
    }
    //上浮算法
    public void swim(int k){
        while (k>1){
            if(less(k,k/2)){
                exch(k,k/2);
            }
            k=k/2;
        }
    }
    //下沉算法
    public void sink(int k){
        while (2*k<=N){
            int min;
            if(2*k+1<=N){
                if(less(2*k,2*k+1)){
                    min = 2*k;
                }else {
                    min =2*k+1;
                }
            }else {
                min =2*k;
            }
            if (less(k,min)){
                break;
            }
            exch(k,min);
            k=min;
        }
    }
}
