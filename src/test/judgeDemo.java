package test;

import com.sun.corba.se.pept.transport.ReaderThread;

/**
 * @Author 杨晓晓
 * @Date 2020/3/20 0:50
 * @Version 1.0
 */
public class judgeDemo {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!ready) {
            System.out.println(ready);
        }
        System.out.println(number);
    }
}

private static class WriterThread extends Thread {
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number = 100;
        ready = true;
    }
}

    public static void main(String[] args) {
        new WriterThread().start();
        new ReaderThread().start();
    }
}
