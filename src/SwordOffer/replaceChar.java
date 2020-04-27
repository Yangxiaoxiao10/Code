package SwordOffer;

/**
 * @Author 杨晓晓
 * @Date 2020/4/17 22:31
 * @Version 1.0
 */
public class replaceChar {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy"));
    }
    public static String replaceSpace(String s) {
        return  s.replace(" ","%20");
    }
    public static String replaceSpace1(String s){
//        String[] s1 = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (char ch :s.toCharArray()) {
            if (ch ==' '){
                sb.append("%20");
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
