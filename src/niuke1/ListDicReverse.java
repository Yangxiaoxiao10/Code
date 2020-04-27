package niuke1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//输入单词句子，按照字典顺序排列输出
public class ListDicReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = new String[n];
        for(int i=0;i<str.length;i++){
            str[i]= sc.nextLine();
        }
        String []ss = dicReverse(str);
        for(String s: ss){
            System.out.println(s);
        }
    }
    private static String[] dicReverse(String[] str){
        List<String> list = new ArrayList<>();
//        for (int i = 0; i < str.length; i++) {
//            list.add(str[i]);
//        }
        Collections.addAll(list,str);
        //str[] 放入list[]数组,高级方法,代替for循环
        return list.toArray(str);
    }
}
