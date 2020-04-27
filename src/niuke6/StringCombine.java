package niuke6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/4/11 22:46
 * @Version 1.0
 */
public class StringCombine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s = s1+s2;
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                if (i%2==0){
                    sb1.append(s.charAt(i));
                }else {
                    sb2.append(s.charAt(i));
                }
            }
            char[] ch1 = sb1.toString().toCharArray();
            char[] ch2 = sb2.toString().toCharArray();
            //按照字典排序
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            char [] cha = new char[ch1.length+ch2.length];
            int j = 0, k = 0;
            //重新放回到一个数组中
            for (int i = 0; i < cha.length; i++) {
                if (i%2==0){
                    cha[i]=ch1[j];
                    j++;
                }else {
                    cha[i] = ch2[k];
                    k++;
                }
            }
            for (int i=0; i<cha.length; i++)
            {
                cha[i] = change(cha[i]);
            }

            System.out.println(cha);
        }
        sc.close();
    }
    public static char change(char a){
        char res;
        switch (a) {
            case '0': res='0';break;
            case '1': res='8';break;
            case '2': res='4';break;
            case '3': res='C';break;
            case '4': res='2';break;
            case '5': res='A';break;
            case '6': res='6';break;
            case '7': res='E';break;
            case '8': res='1';break;
            case '9': res='9';break;

            case 'A': res='5';break;
            case 'B': res='D';break;
            case 'C': res='3';break;
            case 'D': res='B';break;
            case 'E': res='7';break;
            case 'F': res='F';break;

            case 'a': res='5';break;
            case 'b': res='D';break;
            case 'c': res='3';break;
            case 'd': res='B';break;
            case 'e': res='7';break;
            case 'f': res='F';break;
            default :res=a;
        }
        return res;

    }
}
