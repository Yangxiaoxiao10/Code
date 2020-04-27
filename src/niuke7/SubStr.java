package niuke7;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/14 15:17
 * @Version 1.0
 */
public class SubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int num;
        while (sc.hasNext()){
            str = sc.next();
            num = sc.nextInt();
            char[] ch = str.toCharArray();
            int temp =0;//计数长度
            int i= 0;//计数索引
            while (temp<num){
                if (ch[i]>128){
                    temp+=2;
                    if (temp<=num)
                        i++;
                }else {
                    temp++;
                    if (temp<=num)
                        i++;
                }
            }
            System.out.println(str.substring(0,i));
        }
        sc.close();
    }
}
