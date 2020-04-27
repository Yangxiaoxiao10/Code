package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoRepeatNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(a>0){
            if(list.indexOf(a%10)<0){
                list.add(a%10);
            }
            a=(a-a%10)/10;
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        sc.close();
    }
}
