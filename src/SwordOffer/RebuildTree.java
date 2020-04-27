package SwordOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author 杨晓晓
 * @Date 2020/4/21 10:27
 * @Version 1.0
 */
public class RebuildTree {
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
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length==0) return null;
        int rootval = pre[0];
        if (pre.length==1) return new TreeNode(rootval);
        TreeNode root = new TreeNode(rootval);
        int rootIndex = 0;
        for (int i = 0; i < in.length; i++) {
            if (rootval==in[i]){
                rootIndex=i;
                break;
            }
        }
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),
                Arrays.copyOfRange(in,0,rootIndex));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),
                Arrays.copyOfRange(in,rootIndex+1,in.length));
        return root;
    }
}
