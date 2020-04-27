package other;

/**
 * @Author 杨晓晓
 * @Date 2020/3/31 23:02
 * @Version 1.0
 */
public class testBlankSpace {
    public static void main(String[] args) {
        String s = "i am a boy";
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        System.out.println(chars.length);
//        for (int i = 0; i < s.length(); i++) {
//            sb.append(s.charAt(i));
//        }
//        System.out.println(sb.toString());
    }
}
