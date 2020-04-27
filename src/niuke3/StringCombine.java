package niuke3;
//未完成该题
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/25 15:06
 * @Version 1.0
 */
public class StringCombine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            str += scanner.next();

        }
    }

    //交换i，j
    public static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    private static void shell(char[] ch, int step) {
        int N = ch.length;
        for (int i = step; i < N; i++) {
            for (int j = i; j >= step; j -= step) {
                if (ch[j] < ch[j - step]) {
                    swap(ch, j, j - step);
                }
            }
        }
    }

}
