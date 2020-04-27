package niuke3;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/24 21:26
 * @Version 1.0
 */
public class StringEntryAndDecry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string1 = sc.nextLine();
            String string2 = sc.nextLine();
            System.out.println(encryption(string1));
            System.out.println(decryption(string2));
        }
        sc.close();
    }
    private static char encryption(char c){
        if (c>='a'&&c<'z'){
            return  (char)(c+1-32);
        }else if (c== 'z'){
            return 'A';
        }else if (c>= 'A' && c < 'Z'){
            return (char)(c+1+32);
        }else if (c == 'Z'){
            return  'a';
        }else if (c>='0' && c<'9'){
            return (char)(c+1);
        }else if (c == '9'){
            return '0';
        }else {//非字母数字，直接输出
            return c;
        }
    }
    public static char decryption(char c){
        if (c>'a' && c <= 'z'){
            return (char)(c - 1 - 32);
        }else if (c== 'a'){
            return 'Z';
        }else if (c> 'A' && c <= 'Z'){
            return (char)(c - 1 + 32);
        }else if (c == 'A'){
            return  'z';
        }else if (c>'0' && c<='9'){
            return (char)(c - 1);
        }else if (c == '0'){
            return '9';
        }else {//非字母数字，直接输出
            return c;
        }
    }
    public static String encryption(String string){
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch :chars) {
            sb.append(encryption(ch));
        }
        return sb.toString();
    }
    public static String decryption(String string){
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch :chars) {
            sb.append(decryption(ch));
        }
        return sb.toString();
    }
}
