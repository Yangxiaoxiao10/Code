package DataStruct;
import DataStruct.LinkList;
public class LinkListTest {
    public static void main(String[] args) throws Exception{
        LinkList<String> linkList = new LinkList<String>();
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
        String removeResult= linkList.remove(0);
        System.out.println("删除索引0"+removeResult);
        linkList.clear();
        System.out.println("清空后长度为"+linkList.length());
    }
}
