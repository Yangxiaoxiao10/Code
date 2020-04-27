package Ahuawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/19 12:17
 * @Version 1.0
 */
public class strGet {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        String keyS="read";//读取关键字字符串
        String allS="read[addr=0x12,mask=0xf0,val=0x55],read_wo[addr=0x15,mask=0xf0,val=0x23],read[addr=0x92,mask=0xf0,val=0x51]";//读取匹配的字符串
        String[] strings=allS.split("]");//以 ] 分割成字符串，注意分割后有的字符串前面是逗号
        int flag=0;//匹配失败，只要有一个匹配成功就可以
        List<String> list=new ArrayList<>();
        for(int i=0;i<strings.length;i++){//对每一个字符串进行匹配
            if(strings[i].charAt(0)==','){
                strings[i]=strings[i].substring(1);//去掉前面的逗号
            }
            if(strings[i].startsWith(keyS) && (strings[i].charAt(keyS.length())=='[')){
                //以关键字开头并且下面是 [ 开始则表明匹配
                flag=1;
                if(strings[i].indexOf("addr")>0){
                    String[] subS=strings[i].split(",");//以逗号分割子串，寻找等号后面的字符
                    String ret="";
                    for(int j=0;j<subS.length;j++){
                        int indexOfEqual=subS[j].indexOf("=");
                        //对于每个subS[j]中，“=”出现的位置是不一样的，所以后面输出indexOfEqual+1，
                        // 也是自动锁定=后面
                        if(!(subS[j].substring(indexOfEqual+1,indexOfEqual+3).equals("0x") ||
                                subS[j].substring(indexOfEqual+1,indexOfEqual+3).equals("0X") )){
                            System.out.println("FAIL");
                            return;
                        }
                        if(j<subS.length-1){
                            ret+=subS[j].substring(indexOfEqual+1)+" ";
                        }else{
                            ret+=subS[j].substring(indexOfEqual+1);
                        }
                    }
                    list.add(ret);//全都加入到list集合中

                }
            }
        }
        if(flag==0) {//一个关键字都匹配不上直接fail
            System.out.println("FAIL");
            return;
        }
        for(int k=0;k<list.size();k++){
            System.out.println(list.get(k));
        }
//        sc.close();
    }
}
