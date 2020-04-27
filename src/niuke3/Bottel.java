package niuke3;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/22 10:51
 * @Version 1.0
 */
public class Bottel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []bot =new int[11];
        for (int i = 0; i < bot.length; i++) {
            bot[i] = sc.nextInt();
        }
        int [] newbot = bottel(bot);
        for (int i = 0; i < newbot.length; i++) {
            System.out.println(newbot[i]);
        }
    }
    public static int[] bottel(int []bot){
        int len = bot.length;
        for (int i = 0; i < len; i++) {
            if (bot[i]!=0){
                bot[i]= bot[i]/2;
            }
        }
        return bot;
    }
}
