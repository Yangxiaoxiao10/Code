package ThreadTest;

/**
 * @Author 杨晓晓
 * @Date 2020/4/1 0:22
 * @Version 1.0
 */
public class LambdaInsteadInnerClass {
    public void  RunnableTest()    {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };
        Runnable r2 = ()->System.out.println("Hello world two!");
        r1.run();
        r2.run();
    }
}
