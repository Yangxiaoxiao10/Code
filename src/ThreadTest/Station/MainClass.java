package ThreadTest.Station;

/**
 * @Author 杨晓晓
 * @Date 2020/4/26 0:36
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        StationTest station1 = new StationTest("窗口1");
        StationTest station2 = new StationTest("窗口2");
        StationTest station3 = new StationTest("窗口3");
        station1.start();
        station2.start();
        station3.start();
    }
}
