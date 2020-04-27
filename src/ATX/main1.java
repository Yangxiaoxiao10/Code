package ATX;


import java.util.*;

/**
 * @Author 杨晓晓
 * @Date 2020/4/26 19:58
 * @Version 1.0
 */
public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(Arrays.asList(sc.nextInt(),sc.nextInt()));
            }

            for (List ls:list) {
                int nodeval = (int)ls.get(0);
                int k = (int)ls.get(1);
                int deep = getDeepth(nodeval);
                int own = deep-k;
                if (own>0){
                    System.out.println(getnum(nodeval,own));
                }else {
                    System.out.println("-1");
                }
            }
        }
    }
    public static int getDeepth(int node){
        int deep=1;
        while (node!=1){
            node/=2;
            deep++;
        }
        return deep;
    }
    public static int getnum(int node,int own){
        while (own>0){
            node/=2;
            own--;
        }
        return node;
    }
}
