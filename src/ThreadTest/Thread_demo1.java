package ThreadTest;

import java.util.Date;

/**
 * @Author 杨晓晓
 * @Date 2020/3/29 17:22
 * @Version 1.0
 */
public class Thread_demo1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
    public static class MyThread extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("--->>>" + new Date() + "<<<---");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
