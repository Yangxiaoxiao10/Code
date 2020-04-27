package DataStruct.Tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class BinaryTree <Key extends Comparable<Key> ,Value>{
    private Node root;
    private int N;
    private class Node{
        public Key key;
        public Value value;
        public Node left;
        public Node right;
        public Node(Key key,Value value,Node left,Node right){
            this.key = key;
            this.value = value;
            this.left = left;
            this.right =right;

        }
    }
    //获取元素个数
    public int size(){
        return N;
    }
    public  void put(Key key ,Value value){
        root = put(root,key,value);
    }
    //x是当前树
    public Node put(Node x, Key key ,Value value){
        //当前树为空，新键值对为根结点
        if (x==null){
            N++;
            return new Node(key,value,null,null);
        }
        //当前树不为空，比较左右子树的key，往左右移动
        int cmp = key.compareTo(x.key);
        if (cmp>0){
            //右子树找，找完返回新的右子树
            x.right = put(x.right,key,value);
        }else if (cmp<0){
            //左子树找，找完返回新的左子树
            x.left = put(x.left,key,value);
        }else {
            //key相同，就更新值
            x.value= value;
        }
        //最后返回这个树
        return x;
    }
    //查询value
    public Value get(Key key){
        return get(root,key) ;
    }
    //查询value
    public Value get(Node x,Key key){
        if (x==null){
            return null;
        }
        //当前树不为空，比较左右子树的key，往左右移动
        int cmp = key.compareTo(x.key);
        if (cmp>0){
            //右子树找
            return get(x.right,key);
        }else if (cmp<0){
            //左子树找
            return get(x.left.key);
        }else {
            //key相同，就更新值
            return x.value;
        }
    }
    public void delete(Key key){
        delete(root,key);
    }
    public Node delete(Node x ,Key key){
        //树为空
        if (x==null){
            return null;
        }
        //当前树不为空，比较左右子树的key，往左右移动
        int cmp = key.compareTo(x.key);
        if (cmp>0){
            //右子树找，当前是x树，
            //注意理解：左边的x.right，比右边的x.right，只少一个节点，就是即将被删除的那个。
            //保持了树的连续性，至于要删除哪一个，需要delete不断递归下去
            x.right = delete(x.right,key);

        }else if (cmp<0){
            //左子树找
            x.left = delete(x.left,key);
        }else {
            N--;
            //注意，此时已经找到了结点key==x.key；
            // key相同，就删除这个根节点
            //得到右子树的最小结点，去找这个最小结点把它翻上去
            // 删除情况一： 但是如果右子树是空的怎么办？找不到最小的
            // 那就先if判断一下，如果是空的，就不用费心思找那个最小结点了，直接返回左子树
            if (x.right==null){
                //return给谁，是x？此时x是递归函数中，最后一层的delete的x，（此时的操作，已经在上述的delete最底层了）
                //所以这个return 值的x.left，再赋值给88行的x.left。相比来说，更低一层
                //当前树根是x，它注定要被删掉，但是它记得，它还是要返回自己，因为根（自己）不在，
                // 所以要返回自己的子树，把子树赋值给自己（少了一个节点的自己），这是本就连接好父节点的
                return x.left;//返回后怎么链接上去啊？（已解决）
            }
            //删除情况二
            if (x.left==null){
                return x.right;
            }
            //删除情况三
            Node minNode = x.right;
            while (minNode!=null){
                minNode = minNode.left;
            }
            //删除右子树的最小结点
            Node  n = x.right;
            while (n.left!= null){
                if (n.left.left==null){
                    n.left=null;
                }else {
                    n=n.left;
                }
            }
            minNode.left = x.left;
            minNode.right=x.right;
            x= minNode;
//            N--;
        }
        return x;
    }
    public Key min(){
        return min(root).key;
    }
    public Node min(Node x){
        if (x.left!=null){
            return min(x.left);
        }else {
            return x;
        }
    }
    public Key max(){
        return max(root).key;
    }
    public Node max(Node x){
        if (x.right!=null){
            return max(x.right);
        }else {
            return x;
        }
    }
    public Queue<Key> preErgodic(){
//        Queue<Key> keys = new Queue<Key>();


        return  null;
    }
    private void preErgodic(Node x,Queue<Key> keys){

    }
}
