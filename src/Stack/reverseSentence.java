package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 16:34
 * @Version 1.0
 */
public class reverseSentence {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String sentence = sc.nextLine();
        String sentence  = "i am a boy";
        System.out.println(reverse1(sentence));
    }

    private static String reverse1(String sentence){
        String ss="";
        Stack<String> stack = new Stack<String>();
        int i =ss.length()-1;
        while (ss.charAt(i)!=' '){

        }
        stack.push(sentence);
        while (!stack.isEmpty()){
            ss= ss+stack.peek()+" ";
            stack.pop();
        }
        return ss;
    }
}
