package StringMatch;

/**
 * @Author 杨晓晓
 * @Date 2020/4/11 0:19
 * @Version 1.0
 */
public class kmpTest {
    public static void main(String[] args) {
        //最后i定位停在了第14个，字母c位置，j同，为8，14-8=6；也就是前面有6个字母没匹配上
        //那么匹配上的第一个字符位置就是第7个，下标就是6
        System.out.println(kmpMatch("abcabaabaabcacb", "abaabcac"));
    }
    public static int[] getNext(char[] t){
        int[] next = new int[t.length];
        next[0] = -1;
        next[1] = 0;
        int k;
        for (int j = 2; j <t.length ; j++) {
            k = next[j-1];
            //k!=-1,意思是最终可以匹配到
            while (k!= -1){//最外层条件
                if(t[j-1]==t[k]){
                    next[j] = k + 1;
                    break;
                }else {//这里是k还大于0
                    k =next[k];
                }
                //k循环之后，k=-1了。退出循环，
                next[j] = 0;
            }
            /*
            while(index < str2.length){
            if(str2[index - 1] == str2[cn]){
                nexts[index++] = ++cn;
            }else if(cn > 0){
                cn = nexts[cn];
            }else{
                nexts[index++] = 0;
            }
        }
            return nexts;
            }
             */
        }
        return next;
    }
    public static int kmpMatch(String s ,String p){
        char[] s_arr = s.toCharArray();
        char[] p_arr = p.toCharArray();
        int [] next_arr = getNext(p_arr);
        int i =0;
        int j =0;
        while (i<s_arr.length&&j<p_arr.length){
            if (j==-1|| s_arr[i]==p_arr[j]){
                //j=-1,就是开头
                i++;
                j++;
            }else{
                //从最长前缀的后一个字符开始重新找，其实就是j指针回溯
                j =next_arr[j];
            }
        }
        //匹配结束了
        //j到底找没找到呢，看j的值是否等于模式串p_arr的长度就好了，j从0一直加。
        if(j == p_arr.length){
            return i-j;
        }else
            return -1;
    }
}
