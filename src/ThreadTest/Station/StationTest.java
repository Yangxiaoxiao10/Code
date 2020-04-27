package ThreadTest.Station;

/**
 * @Author 杨晓晓
 * @Date 2020/4/26 0:29
 * @Version 1.0
 */
public class StationTest extends Thread{
    public StationTest(String name){
        super(name);
    }
    static int ticket =20;
    static Object ob ="aa";

    @Override
    public void run() {
        while (ticket>0){
            synchronized (ob){
                if (ticket>0){
                    System.out.println(getName() + "卖出了第" + ticket + "张票");
                    ticket--;
                }else{
                    System.out.println("票卖完了");
                }
            }
            try{
               sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
