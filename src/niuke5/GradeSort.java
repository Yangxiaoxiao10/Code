package niuke5;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/31 23:24
 * @Version 1.0
 */


import java.util.*;
public class GradeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int b=sc.nextInt();
            LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
            for (int i = 0; i <n ; i++) {
                String name=sc.next();
                int score=sc.nextInt();
                map.put(name+" "+score,score);
            }
            //用键值对排序
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            if(b==0){//降序
                Collections.sort(list, (o1,o2)->(o2.getValue()-o1.getValue()));
            }else if(b==1){//升序
                Collections.sort(list, (o1,o2)->(o1.getValue()-o2.getValue()));
            }
            for(Map.Entry<String, Integer> entry:list){
                System.out.println(entry.getKey());
            }
        }
        sc.close();
    }

}
