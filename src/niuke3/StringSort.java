package niuke3;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/23 21:08
 * @Version 1.0
 */
/*
冒泡排序算法。把字母字符进行冒泡排序，因为其是稳定排序，不会改变同字母（a,A）的出现顺序
所以，先对字符串中的字母字符排序，放入StringBuffer中，然后再次遍历string中的非字母字符
（如，：等）
 */
public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        StringBuffer sb;
        while (sc.hasNext()){
            string= sc.nextLine();
            sb = new StringBuffer();
            for (int i =0;i <26;i++){
                 char ch = (char)(i+'a');
                 for (int j =0;j< string.length();j++){
                     if (string.charAt(j)==ch||string.charAt(j)==ch-32){
                         sb.append(ch);
                     }
                 }
             }
             //插入非字母字符串
            for (int i = 0; i < string.length(); i++) {
                char c =string.charAt(i);
                if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                    continue;//直接跳过
                }else {
                    sb.insert(i,c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
