package niuke7;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 14:14
 * @Version 1.0
 */
public class CorrectIP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            String[] IPStr = sc.nextLine().split("\\.");
            int count =0;
            for (String ip:IPStr) {
                int n = Integer.parseInt(ip);
                if (n>=0&&n<=255){
                    count++;
                }
            }
            if (count==4){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
