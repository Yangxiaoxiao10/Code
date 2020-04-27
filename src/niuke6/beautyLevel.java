package niuke6;

import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/4/7 22:12
 * @Version 1.0
 */
//这里有个巨坑。nextLine不能放在nextInt后面读取，会多读取一个\n，导致后面的读取错误
//要么都用nextLine，要么后者只用next
    //本题思想，是用数组下标来计数字符出现次数，很巧妙的思想。还可以用map<Character,Integer>代替
public class beautyLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = sc.next();
            }
            List<Integer> c = beauty(str);
            for (int i:c) {
                System.out.println(i);
            }
         }
        sc.close();
    }
    private static List<Integer> beauty(String[] strings){
        //计算漂亮度
        //a-z 是97-122;A-Z是65-90;
        List<Integer> counts = new ArrayList<>();
        for (String str:strings) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                    count[str.charAt(i)-'a']++;
                }else {
                    count[str.charAt(i)-'A']++;
                }
            }
            //排序一下，求最大漂亮度，把出现的多的字符全都往26，25靠近，
            // 比如k出现4次最多，就放到对应26
            Arrays.sort(count);
            int bea = 0;
            for (int i = 0; i < 26; i++) {
                bea+=count[i]*(i+1);
            }
            counts.add(bea);
        }
        return counts;
    }
}
