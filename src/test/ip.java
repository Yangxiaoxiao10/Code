package test;

/**
 * @Author 杨晓晓
 * @Date 2020/3/26 14:03
 * @Version 1.0
 */
public class ip {
    public static void main(String[] args) {
        String s = "10.0.3.193";
        String [] ss = s.split("\\.");
//        long a = Long.parseLong("167773121");
//        long b = 167773121;
//        for (int i = 0; i < ss.length; i++) {
//            System.out.println(ss[i]);
//        }
//        String a = "10";
//        Long b = (Long.parseLong(a)<<24);
//        System.out.println(b);
        System.out.println((Long.parseLong(ss[0])<<24)+(Long.parseLong(ss[1])<<16)+
                (Long.parseLong(ss[2])<<8)+Long.parseLong(ss[3]));
//        long c = b>>24;
//        int m = 8>>2;
//        int j =64;
//        System.out.println(2^2);;
//        System.out.println(j>>2);
//        System.out.println(8>>2);
//        System.out.println(m);
    }
}
