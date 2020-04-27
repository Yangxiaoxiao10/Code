package test;

import java.util.Vector;

/**
 * @Author 杨晓晓
 * @Date 2020/4/5 0:08
 * @Version 1.0
 */
public class testVec {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3,3);
        System.out.println("扩容前cap="+v.capacity());
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        for (int vi: v) {
            System.out.print(vi+" ");
        }
        System.out.println();
        System.out.println("扩容后cap="+v.capacity());

    }
}
