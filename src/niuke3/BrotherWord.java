package niuke3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/24 16:47
 * @Version 1.0
 */
/*
思路
1 先获取这些单词，放入对应长度的数组dict[]，并定义目标单词target和待寻找索引brotherIndex
2 Arrays.sort() 将原数组dict按照字典排序；判断兄弟单词（2.1），把兄弟单词放入ArrayList list,最后输出list长度
和brotherIndex元素
  2.1子方法，判断两个字符串是否为兄弟单词，将其拆分为char字符数组，然后排序，
  按照索引对比单词。

 */
public class BrotherWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int wordNum = sc.nextInt();
            String []dict = new String[wordNum];
            for (int i = 0; i < wordNum; i++) {
                dict[i]= sc.next();
            }
            String target = sc.next();
            int brotherIndex = sc.nextInt();
            wordSort(dict,target,brotherIndex);
            sc.nextLine();
        }
    }
    //按照字典顺序存放单词，调用Array的sort方法
    public static void wordSort(String[] dict,String target, int brotherIndex){
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(dict);
        //判断字典中的单词，和当前单词是不是兄弟单词
        for (String cur :dict) {
            if (isBrother(target,cur)){
                list.add(cur);
            }
        }
        System.out.println(list.size());
        if (brotherIndex <= list.size() && list.size()>0){
            System.out.println(list.get(brotherIndex-1));
        }
    }
    //判断是否是兄弟
    public static boolean isBrother(String target,String cur){
        if (target.equals(cur)){
            return false;
        }
        if (target.length()!=cur.length()){
            return false;
        }
        //拆分两个比对的单词，排序后判断其字符是否一致
        char[] targetArray = target.toCharArray();
        char[] curArray = cur.toCharArray();
        Arrays.sort(targetArray);
        Arrays.sort(curArray);
        for (int i = 0; i <curArray.length; i++) {
            if (targetArray[i]!=curArray[i]) {
                return false;
            }
        }
        return true;
    }
}
