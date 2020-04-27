package ATX;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author 杨晓晓
 * @Date 2020/4/26 19:59
 * @Version 1.0
 */
public class main2 {
    static  Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] op = new String[n];
            for (int i = 0; i < n; i++) {
                op[i] = sc.nextLine();
            }
            for (String s : op) {
                if (getnum(s)!=-1){
                    //为整数
                    Qadd(getnum(s));
                }else if (s.equals("peek")){
                    System.out.println(Qpeek());
                }else {
                    Qpoll();
                }
            }
//            for (int i = 0; i < n; i++) {
//                String string = sc.nextLine();
//                if (string.startsWith("add")){
//                    String[] s = string.split(" ");
//                    Qadd(Integer.parseInt(s[1]));
//                }else if (string.equals("peek")){
//                    System.out.println(Qpeek());
//                }else {
//                    Qpoll();
//                }
//            }

        }
    }
    public  static int getnum(String s){
        String[] s1 = s.split(" ");
        if (s1[0].equals("add")){
            return Integer.parseInt(s1[1]);
        }
        return -1;
    }
    public static void Qadd(int a){
        stack1.push(a);
    }
    public static int Qpeek(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    public static void Qpoll(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }
}
