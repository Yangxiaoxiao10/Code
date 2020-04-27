package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 13:32
 * @Version 1.0
 */
public class pokerRandom {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int [] poker={1,2,3,4,5,6,7,8};
        for (int i = 0; i < poker.length; i++) {
            list.add(poker[i]);
        }
        System.out.println("打乱前：");
        for (int ls: list) {
            System.out.print(ls+" ");
        }
        System.out.println();
        Random ran = new Random();
        Collections.shuffle(list,ran);
        System.out.println("打乱后：");
        for (int ls: list) {
            System.out.print(ls+" ");
        }
    }
}
