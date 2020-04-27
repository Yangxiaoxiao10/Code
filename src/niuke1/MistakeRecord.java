package niuke1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MistakeRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<String> names = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        while (sc.hasNext()){
            String str = sc.next();
            String []fileLine = str.split(" \\\\");//第一次分割
            String name = fileLine[fileLine.length-1];
            name = name +" "+sc.next();
            int index = names.indexOf(name);{//index，存在即返回该元素首次出现索引，不存在就是返回-1
                if (index!=-1){//列表中已经存在该记录
                    sum.set(index,sum.get(index)+1);//找到该索引位置的值，+1，即错误数加1
                }else {
                    names.add(name);//有新的元素出现时候
                    sum.add(1);//对应的该错误次数设置为1
                }
            }
            String []namestmp = new String[names.size()];
            names.toArray(namestmp);//转换为String数组
            Integer [] sumtmp = new Integer[sum.size()];
            sum.toArray(sumtmp);
            int n = fileLine.length;

        }

    }
}
