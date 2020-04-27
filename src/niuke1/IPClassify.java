package niuke1;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class IPClassify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int na = 0, nb = 0, nc = 0, nd = 0, ne = 0, err = 0, pri = 0;
        String[] address;
        String[] ip;
        String[] mask;
        while (sc.hasNext()){
            String IPLine = sc.nextLine();
            address = IPLine.split("~");
            ip = address[0].split("\\.");
            mask =address[1].split("\\.");
            if(CheckMask(mask)){
                if (CheckIP(ip)){
                    int i =Integer.parseInt(ip[0]);
                    if(i>=1&&i<=126){
                        na++;
                        if(i==10){
                            pri++;
                        }
                    }
                    if(i>=128&&i<=191) {
                        nb++;
                        if (i==172&&Integer.parseInt(ip[1])>=16&&Integer.parseInt(ip[1])<=32){
                            pri++;
                        }
                    }
                    if(i>=192&&i<=223){
                        nc++;
                        if (i==192&&Integer.parseInt(ip[1])==168){
                            pri++;
                        }
                    }
                    if(i>=224&&i<=239){
                        nd++;
                    }
                    if(i>=240&&i<=255){
                        ne++;
                    }
                    }
                else {
                    err++;
                }
            }else {
                err++; }
        }
//        sc.close();
        System.out.println(na+" "+nb+" "+nc+" "+nd+" "+ne+" "+err+" "+pri);
    }
    private static boolean CheckMask(String[] mask){
        if(mask.length!=4){
            return false;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<mask.length;i++){
            String b = Integer.toBinaryString(Integer.parseInt(mask[i]));//b此时是8位二进制字符串
            while(b.length()!=8){
                b="0"+b;
            }
            sb.append(b);
        }
        int firstIndex = sb.indexOf("0");
        int lastIndex = sb.lastIndexOf("1");
        if (firstIndex < lastIndex){//0比1出现的早一点
            return false;
        }
        return true;
    }
    private static  boolean CheckIP(String[] ip){
        if (ip.length==4&&!ip[0].equals("")&&!ip[1].equals("")&&!ip[2].equals("")&&!ip[3].equals("")){
            return true;
        }
        return false;
    }
}
