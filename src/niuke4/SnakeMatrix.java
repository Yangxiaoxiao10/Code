package niuke4;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/26 16:05
 * @Version 1.0
 */
public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int s = sc.nextInt();
            int first =1;
            for (int i= 1;i<=s;i++ ){
                System.out.print(first);
                int temp = first;
                for (int j =i+1;j<=s;j++){
                    temp+=j;
                    System.out.print(" "+temp);
                }
                System.out.println("");
                first+=i;
            }
        }
    }
}
