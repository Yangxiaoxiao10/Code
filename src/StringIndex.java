import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/4/2 0:24
 * @Version 1.0
 */
public class StringIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            String ss = "-1";
            for (char c :ch) {
                if (str.indexOf(c) == str.lastIndexOf(c)){
                    ss = c+ "";
                    break;
                }
            }
            System.out.println(ss);
        }
    }
}
