
package DataStruct.BiTree;

import java.util.Stack;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 1:43
 * @Version 1.0
 */
public class Order {
    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }
    public static void inOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty()||root!=null){
            //把左边结点全部入栈
            if (root!=null){
                stack.push(root);
                root = root.left;
            }else {
                //如果当前结点没有孩子,结点出栈，
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;
            }
        }
    }
}
