package test;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 12:47
 * @Version 1.0
 */
public class StringNoRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int firstIndex = s.indexOf(ch);
                int lastIndex  =s.lastIndexOf(ch);
                if (firstIndex==lastIndex||firstIndex==i){
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
