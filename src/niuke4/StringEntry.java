package niuke4;
import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/26 22:33
 * @Version 1.0
 */
public class StringEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String key = sc.nextLine();
            String entrypt = sc.nextLine();

            char[] ch = new char[26];
            StringBuffer sb = new StringBuffer();
            //对密钥去重,先获取字符，大写不变，小写变大写
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                if (c>='a'&&c <= 'z'){
                    c = (char)(c-32);
                }
                //去重,查找该字符，是否出现在sb中，无则逐个添加到sb中，有则跳过
                if (sb.indexOf(String.valueOf(c))<0){
                    sb.append(c);
                }
            }
            //制作对照表的后面字符,用大写26字母表和密钥key对比
            if (sb.length()<26){
                for (int i = 0; i <26 ; i++) {
                    char temp =(char)(i+'A');
                    if (sb.indexOf(String.valueOf(temp))<0){
                        //不存在，把该加入sb
                        sb.append(temp);
                    }
                }
            }
            //确定了加密对照表ch
            ch = sb.toString().toCharArray();
            //开始变换entrypt密文串
            //创建一个StringBuffer存放加密后的字符串
            StringBuffer sb1= new StringBuffer();
            for (int i = 0; i <entrypt.length() ; i++) {
                char r = entrypt.charAt(i);
                //这个地方很巧妙，利用字符的ASCLL码值，找出该字符对应的加密表中的字符下标。比如A->T
                if (r>='A'&& r<='Z'){
                    sb1.append(ch[r-65]);
                }else {
                    //小写字符先-97，找到索引，取得对应值，再转换为大写
                    sb1.append((char)(ch[r-97]+32));
                }
            }
            System.out.println(sb1.toString());
            }
        }
    }

