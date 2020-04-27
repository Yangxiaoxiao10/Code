package niuke1;

import java.util.Scanner;
import java.util.Stack;

public class SentenceReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(reverse(sentence));
        System.out.println(reverse1(sentence));
    }
    public static String reverse(String sentence){
        String[] str = sentence.split(" ");
        String ss="";
        for(int i=str.length-1;i>=0;i--){
            ss = ss+str[i]+" ";
        }
        return ss;
    }
    public static String reverse1(String sentence){
        String ss="";
        Stack<String> stack = new Stack<String>();
        stack.push(sentence);
        while (!stack.isEmpty()){
            ss= ss+stack.peek()+" ";
            stack.pop();
        }
        return ss;
    }
}
