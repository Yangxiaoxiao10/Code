package test;

/**
 * @Author 杨晓晓
 * @Date 2020/3/27 16:17
 * @Version 1.0
 */
public class IPtest {
    public static void main(String[] args) {
//        int a = Integer.valueOf("0101")&Integer.valueOf("0101");
//
//        if ((Integer.valueOf("10")&Integer.valueOf("9"))==
//                (Integer.valueOf("0101")&Integer.valueOf("0101"))){
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }
//        if (((10)&(10))==((9)&(9))){
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }

        int a = ((10)&(9));
        int m =Integer.valueOf("10")&Integer.valueOf("9");

        String aa = Integer.toBinaryString(10);
        String bb = Integer.toBinaryString(9);
        System.out.println("m="+m);
        System.out.println(aa+","+bb);
        System.out.println(a);
    }
}
