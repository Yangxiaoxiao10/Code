package niuke3;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/22 9:43
 * @Version 1.0
 */
public class EasyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
        String string = sc.nextLine();
        System.out.println(PasswordTrans(string));
        }
    }

    public static String PasswordTrans(String string) {
        char[] chars = string.toCharArray();
        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String s2 = "bcdefghijklmnopqrstuvwxyza22233344455566677778889999";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='a'&&chars[i]<='z'||chars[i]>='A'&&chars[i]<='Z'){
                chars[i] = s2.charAt(s1.indexOf(chars[i]));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
