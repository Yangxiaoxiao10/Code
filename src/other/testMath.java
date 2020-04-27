package other;

/**
 * @Author 杨晓晓
 * @Date 2020/3/31 17:02
 * @Version 1.0
 */
public class testMath {
    public static void main(String[] args) {
        double e = 2.34572935789;
        String str = String.valueOf(e);
        int len = str.length()- str.indexOf(".");
        //
        System.out.println("len = "+len);
//        System.out.println(String.format("%.7f", e));
        System.out.printf("%.7f",e);
        System.out.println(String.format("%.7f",e));
    }
}
