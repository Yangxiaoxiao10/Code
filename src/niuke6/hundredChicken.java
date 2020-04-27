package niuke6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/11 16:57
 * @Version 1.0
 */
public class hundredChicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        List<String> s = new ArrayList<String>();
        while (sc.hasNext()){
            int n = sc.nextInt();
            int x,y,k;
            for (x = 0; x <20 ; x++) {
                for ( y = 0; y <34 ; y++) {
                    k =100-x-y;
                    if (k%3==0&&x*5+y*3+k/3==100){
                        System.out.println(x+" "+y+" "+k);
                    }
                }
            }
//            for (String ss: s) {
//                System.out.println(ss);
//            }
        }
    }
}
