package niuke4;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 16:45
 * @Version 1.0
 */
public class IPMask {
    public static void main(String[] args) {
        //接受子网掩码和ip地址。
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String Mask = sc.next();
            String IP1 = sc.next();
            String IP2 = sc.next();
            boolean flag = false;
            if (Mask==null||Mask.length()==0||IP1==null||IP1.length()==0||IP2==null||IP2.length()==0){
                System.out.println(1);
                break;
            }
            //分割字符串
            String[] MaskStr = Mask.split("\\.");
            String[] IP1Str = IP1.split("\\.");
            String[] IP2Str = IP2.split("\\.");
            //检查是否为空或者格式不符合，是否0-255
            for (int i = 0; i <MaskStr.length ; i++) {
                if (Integer.parseInt(MaskStr[i])>255||Integer.parseInt(MaskStr[i])<0||
                        Integer.parseInt(IP1Str[i])>255||Integer.parseInt(IP1Str[i])<0||
                        Integer.parseInt(IP2Str[i])>255||Integer.parseInt(IP2Str[i])<0){
                    System.out.println(1);
                    System.exit(0);
                    //exit(0) 不执行下面代码
                }
            }
            //判断ip1&子网掩码==ip2&子网掩码
            for (int i = 0; i <MaskStr.length; i++) {
                if ((Integer.valueOf(MaskStr[i])&Integer.valueOf(IP1Str[i]))==
                        (Integer.valueOf(MaskStr[i])&Integer.valueOf(IP2Str[i]))){
                    flag = true;
                }else {
                    //这个break是必须的，如果出现false，立刻跳出循环，即有错必错，
                    // 不用继续判断下面的字符串了
                    flag =false;
                    break;
                }
            }
            if (flag){
                System.out.println(0);
            }else {
                System.out.println(2);
            }
        }



    }
}
