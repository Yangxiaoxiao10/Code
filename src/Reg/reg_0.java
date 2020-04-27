package Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author 杨晓晓
 * @Date 2020/4/16 15:03
 * @Version 1.0
 */
public class reg_0 {
    public static void main(String[] args) {
        String a ="<h1>贪婪匹配</h1>hdewuofbp920b";
        String reg = "<.*?>[a-z0-9]+";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(a);
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
