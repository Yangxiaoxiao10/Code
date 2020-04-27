package DataStruct.BiTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author 杨晓晓
 * @Date 2020/4/6 0:37
 * @Version 1.0
 */
public class LevelOrder {

     //Definition for a binary tree node.
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
         if (root ==null)
             return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (count>0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                    count--;
                }
            }
            res.add(list);
        }
         return res;
    }
}
