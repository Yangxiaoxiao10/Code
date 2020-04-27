package DataStruct;

import java.util.ArrayList;
import java.util.HashMap;

public class testOne {
//    private
    private static ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args) {
        int n=2;
        printProcesses(1,n,true);
        //打印
        String []str= res.toArray(new String[]{});
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void printProcesses(int n, int N ,boolean down){
        if (n>N){
            return;
        }
        printProcesses(n+1,N,true);
        res.add(down?"down":"up");
        printProcesses(n+1,N,false);
    }
}
