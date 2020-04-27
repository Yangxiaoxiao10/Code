package XCTest;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test2 {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int calcMinStaff(int a[],int b[]) {

        return 0;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        while (in.hasNext()){
            for (int i = 0; i < n; i++) {
                String [] str = in.nextLine().split(",");
                a[0] = Integer.valueOf(str[0]);
                b[0] = Integer.valueOf(str[1]);
            }
        }
        int res;
        res = calcMinStaff(a,b);
        System.out.println(String.valueOf(res));

    }
}
