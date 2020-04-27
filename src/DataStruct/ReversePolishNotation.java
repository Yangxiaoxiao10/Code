package DataStruct;

import java.util.Stack;
import  java.math.*;
public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] notation= {"3","17","15","-","*","18","6","/","+"};
        int result = caculate(notation);
        System.out.println("结果为："+result);
    }
    public static int caculate( String[] notation){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < notation.length; i++) {
            String curr = notation[i];
            Integer o1;
            Integer o2 ;
            Integer result;
            switch (curr){
                case "+":
                    o1= stack.pop();
                    o2 = stack.pop();
                    result = o2+o1;
                    stack.push(result);
                    break;
                case "-":
                    o1= stack.pop();
                    o2 = stack.pop();
                    result = o2-o1;
                    stack.push(result);
                    break;
                case "*":
                    o1= stack.pop();
                    o2 = stack.pop();
                    result = o2*o1;
                    stack.push(result);
                    break;
                case "/":
                    o1= stack.pop();
                    o2 = stack.pop();
                    result = o2/o1;
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.parseInt(curr));
                    break;
            }
        }
        int result = stack.pop();
        return result;
    }
}
