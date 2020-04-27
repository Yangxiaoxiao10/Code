//20 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//        有效字符串需满足：
//
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//        注意空字符串可被认为是有效字符串。
//如果valid，最后返回的栈为空，因为两两消除(即对应括号出栈)，如果not valid,返回栈有剩余开括号；
import java.util.HashMap;
import java.util.Stack;
public class valid_parentheses {
    private HashMap<Character,Character> map ;
    public valid_parentheses(){
        this.map = new HashMap<Character, Character>();
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }
    public boolean is_valid(String s){
        Stack<Character> stack= new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(this.map.containsKey(c)) {//如果遇到闭括号
                char topElement = stack.empty() ? '#' : stack.pop();//若栈不为空，取出栈顶元素
                if (topElement != this.map.get(c)) {
                    System.out.println("false");
                    return false;
                }
            }
            else {
                stack.push(c);//如果遇到的闭括号没有匹配到对应的开括号，那么就把该闭括号入栈
            }
        }
        if(stack.isEmpty()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        return stack.isEmpty();//返回值是boolean,如果最后栈为空，返回true，即所有括号匹配完毕，反之匹配有剩余
        //返回false
    }
    public static void main(String[] args) {
        valid_parentheses vp = new valid_parentheses();
        String s = "{[()]";
        vp.is_valid(s);
    }
}
