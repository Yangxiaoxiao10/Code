//
//88给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//
//        说明:
//
//        初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//        你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//        示例:
//
//        输入:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//
//        输出: [1,2,2,3,5,6]
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/merge-sorted-array
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

//使用后向指针
//标签：从后向前数组遍历
//        因为 nums1 的空间都集中在后面，所以从后向前处理排序的数据会更好，节省空间，一边遍历一边将值填充进去
//        设置指针 len1 和 len2 分别指向 nums1 和 nums2 的有数字尾部，从尾部值开始比较遍历，同时设置指针 len 指向 nums1 的最末尾，每次遍历比较值大小之后，则进行填充
//        当 len1<0 时遍历结束，此时 nums2 中还有数据未拷贝完全，将其直接拷贝到 nums1 的前面，最后得到结果数组
//        时间复杂度：O(m+n)O(m+n)

import java.util.Arrays;

public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= m-1;
        int p2= n-1;
        int p = m+n-1;
        while((p1>=0) &&(p2>=0))
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        System.arraycopy(nums2,0,nums1,0, p2+1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        mergeSortedArray ms = new mergeSortedArray();
        int nums1[]={1,2,3,0,0,0,0,0};
        int nums2[]={2,5,6};
        int m =3,n=3;
        ms.merge(nums1,m,nums2,n);
    }
}
