package leetcode;

/**
 * @Author 杨晓晓
 * @Date 2020/4/24 14:51
 * @Version 1.0
 */
public class leetcode14 {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){return "";}
        String pre = strs[0];
        for(int i =1;i<strs.length;i++){
            while(strs[i].indexOf(pre)>0){
                pre = pre.substring(0,pre.length()-1);
                if(pre.isEmpty()){
                    return "";
                }
            }
        }
        return pre;
    }
    public String longestCommonPrefix1(String[] strs) {
        String re ="";
        if(strs.length==0) return re;
        String ans= strs[0];
        for(int i=0;i<ans.length();i++){
            int j=1;
            for(;j<strs.length;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    return re;
                }
            }
            re+=strs[0].charAt(j);
        }
        return re;
    }
}
