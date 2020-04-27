package niuke3;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/25 20:31
 * @Version 1.0
 */
public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            if ("".equals(str.trim())){
                System.out.println("");
            }else {
                String[] word = str.split("[^a-zA-Z]+");
                StringBuilder sb = new StringBuilder();
                for (int i = word.length-1; i >=0; i--) {
                    sb.append(word[i]+" ");
                }
                System.out.println(sb.toString().trim());
            }
        }
        sc.close();
    }
}
