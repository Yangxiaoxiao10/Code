package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/21 0:23
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LR_Print_BTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
            list.add(node.val);
        }
        return list;
    }
}
