package DataStructTest;
import DataStruct.TwoWayLinkList;

public class TwoWayLinkListTest {
    public static void main(String[] args) throws Exception{

        TwoWayLinkList<String> linkList = new TwoWayLinkList<String>();
        linkList.insert("www");
        linkList.insert("yxx");
        linkList.insert("yyy");
        for (String str:linkList
             ) {
            System.out.println(str);
        }
        System.out.println("_____________________________");
        String getResult= linkList.get(1);
        System.out.println("获取索引1结果为"+getResult);
//        String removeResult= linkList.remove(0);
//        System.out.println("删除索引0"+removeResult);
//        linkList.clear();
//        System.out.println("清空后长度为"+linkList.length());
        System.out.println("_____________________________");
        System.out.println("第一个元素是"+linkList.getFirst());
        System.out.println("最后一个元素为"+linkList.getLast());
    }
}
