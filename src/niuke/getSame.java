package niuke;

import java.util.*;
public class getSame{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double f = sc.nextDouble();
        System.out.println(getSame1(f));
    }
    public static int getSame1(double f){
        double d = f+0.5;
        return (int)d;
    }
}
