package niuke4;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 0:33
 * @Version 1.0
 */
public class BallJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int h = sc.nextInt();
            double sum = h;
            double height = h;
            for (int i = 1; i < 5; i++) {
                height /=2;
                sum += height*2;
            }
            System.out.println(sum);
            System.out.println(height);
        }
    }
}
