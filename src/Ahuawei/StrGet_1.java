package Ahuawei;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 14:26
 * @Version 1.0
 */
public class StrGet_1 {
    public static void main(String[] args) {
        String key ="read";
        String s="read[addr=0x12,mask=0xf0,val=0x55],read_wo[addr=0x15,mask=0xf0,val=0x23],read[addr=0x92,mask=0xf0,val=0x51]";
        String[] strings = s.split("]");
        int flag =0;
        List<String> list=new ArrayList<>();
        for (String str:strings) {
            if (str.charAt(0)==','){
                str = str.substring(1);
            }
            //判断以'read['的字符串
            if (str.startsWith(key)&&str.charAt(key.length())=='['){
                flag =1;
                if (str.indexOf("addr")>0){
                    String[] sub = str.split(",");
                    StringBuffer res = new StringBuffer();
                    for (String ss:sub) {
                        int equalIndex = ss.indexOf("=");
                        if (!(ss.substring(equalIndex+1,equalIndex+3).equals("0x")||
                                ss.substring(equalIndex+1,equalIndex+3).equals("0X"))){
                            System.out.println("FAIL");
                            return;
                            //直接结束代码
                        }
                        res.append(ss.substring(equalIndex+1));
                        res.append(" ");
                    }
                    list.add(res.toString());
                }
            }
        }
        if(flag==0) {//一个关键字都匹配不上直接fail
            System.out.println("FAIL");
            return;
        }
        for (String ls:list) {
            System.out.println(ls);
        }
    }
}
