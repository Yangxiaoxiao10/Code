package Ahuawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 13:53
 * @Version 1.0
 */
public class strGetTest {
    public static void main(String[] args) {
        String keyS ="read";
        String str = "read[addr=0x12,mask=0xf0,val=0x55],read_wo[addr=0x15,mask=0xf0,val=0x23],read[addr=0x92,mask=0xf0,val=0x51]";
        String[] strings=str.split(" ");
        List<String> list=new ArrayList<>();
        List<String> list1;
        for (String str1: strings) {
            if(str1.startsWith(keyS) && (str1.charAt(keyS.length())=='[')){
                if(str1.indexOf("addr")>0){
                    String[] subS=str1.split(",");
                    String ret="";
                    list1 = Arrays.asList(subS);
                }
            }
        }
        for(int k=0;k<list.size();k++){
            System.out.println(list.get(k));
        }
    }
}
