package niuke;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class MergeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<count;i++){
            String line = sc.nextLine();
            String[] aa = line.split(" ");
            Integer key = Integer.parseInt(aa[0]);
            Integer value =  Integer.parseInt(aa[1]);
            map.put(key,map.getOrDefault(key,0)+value);
        }
        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
