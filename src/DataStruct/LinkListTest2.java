package DataStruct;

public class LinkListTest2 {
    public static void main(String[] args) throws Exception{
        LinkList<String> linkList = new LinkList<String>();
        linkList.insert("www");
        linkList.insert("yxx");
        linkList.insert("yyy");
        linkList.insert("hhh");
        for (String str:linkList) {
            System.out.println(str);
        }
        System.out.println("_____________________________");
        linkList.reverse();
        for (String str:linkList) {
            System.out.println(str);
        }
    }
}
