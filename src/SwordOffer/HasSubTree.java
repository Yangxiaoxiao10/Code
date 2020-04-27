package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 19:40
 * @Version 1.0
 */
public class HasSubTree {
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
    public  static boolean subTree(TreeNode root1,TreeNode root2){
         boolean result = false;
         if (root1!=null&& root2!=null){
             if (root1.val ==root2.val){
                 result = DoesTree1HasTree2(root1,root2);
             }
             if (!result){
                 result = subTree(root1.left,root2);
             }
             if (!result){
                 result = subTree(root1.right,root2);
             }
         }
         return result;
    }
    public static boolean DoesTree1HasTree2(TreeNode node1, TreeNode node2){
        //Tree2遍历结束，
        if (node2==null) return true;
         //tree2没结束，tree1遍历结束，没找到
         if (node1==null ) return false;
         //值不等
         if(node1.val != node2.val) return false;
         //三个if，是递归退出的三种条件
         return DoesTree1HasTree2(node1.left,node2.left)&&DoesTree1HasTree2(node1.right,node2.right);
    }
}
