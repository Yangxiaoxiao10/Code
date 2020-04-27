package leetcode;

import java.util.Stack;

/**
 * @Author 杨晓晓
 * @Date 2020/4/24 16:16
 * @Version 1.0
 */
public class leetcode20 {
    public static void main(String[] args) {
        String a ="()[}";
        System.out.println(isValid(a));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch:chars) {
            if (ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else {
                char c = stack.peek();
                if (ch!=')' && c=='(') {
                    return false;
                }
                if (ch!=']' && c=='[') {
                    return false;
                }
                if (ch!='}' && c=='{') {
                    return false;
                }else {
                    return true;
                }
            }
        }
        return stack.isEmpty();
    }
}
