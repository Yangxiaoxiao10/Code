package niuke;

import java.util.Scanner;

public class Sixteen2Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String sixteen =sc.next().substring(2);
            String ten = Integer.valueOf(sixteen,16).toString();
            System.out.println(ten);
        }
    }
}
