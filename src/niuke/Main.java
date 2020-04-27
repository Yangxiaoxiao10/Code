package niuke;
import java.util.Scanner;
//import java.util.Scanner;
public class Main{
    public static void getLength(String s){
        String[] str =s.split(" ");
        int length = str.length;
        System.out.println(str[length-1].length());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        getLength(s);
        //键盘输入
    }
}
