package niuke6;

/**
 * @Author 杨晓晓
 * @Date 2020/4/7 23:08
 * @Version 1.0
 */
import java.util.*;

public class beauty{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int N = scan.nextInt();
            String[] str = new String[N];
            for(int i=0;i<N;i++){
                str[i] = scan.next();
            }
            for (int i = 0; i < N; i++) {
                System.out.println(str[i]);
            }
//            for(int i=0;i<N;i++){
//                int[] count = new int[26];
//                int len = str[i].length();
//                for(int j=0;j<len;j++){
//                    int ascii = str[i].charAt(j);
//                    //System.out.println("ascii="+ascii);
//                    if(ascii>='a'&& ascii<='z'){
//                        count[ascii-97]++;
//                    }else if(ascii>='A'&& ascii<='Z'){
//                        count[ascii-65]++;
//                    }
//                }
//                Arrays.sort(count);
//                int piaoliangdu = 0;
//                for(int k =0;k<26;k++){
//                    piaoliangdu+=count[k]*(k+1);
//                }
//                System.out.println(piaoliangdu);
//            }
        }
//        scan.close();
    }
}

