package DataStruct.BiTree;

import java.util.LinkedList;

/**
 * @Author 杨晓晓
 * @Date 2020/4/6 21:50
 * @Version 1.0
 */
public class levelOrderSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x) { val = x; }
//    }
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
    class Solution {
        public int deepestLeavesSum(TreeNode root) {
            int res=0;
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                int count =0;
                while((--size)>=0){
                    TreeNode node = queue.poll();
                    count+=node.val;
                    if(node.left!=null){
                        queue.add(node.left);
                    }
                    if(node.right!=null){
                        queue.add(node.right);
                    }
                }
                res = count;
            }
            return res;
        }

        public int TreeDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int depth = 0;
            while(!queue.isEmpty()){
                int size = queue.size();
                while(--size>0){
                    TreeNode top = queue.poll();
                    depth++;
                    if(top.left!=null){
                        queue.add(top.left);
                    }
                    if(top.right!=null){
                        queue.add(top.right);
                    }
                }

            }
            return depth;
        }
    }
}
