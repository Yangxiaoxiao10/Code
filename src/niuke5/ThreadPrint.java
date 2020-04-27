
package niuke5;

import java.util.Scanner;

/**
 * @Author 杨晓晓
 * @Date 2020/3/29 23:36
 * @Version 1.0
 */
public class ThreadPrint {
    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        MyThreadPrinter pa = new MyThreadPrinter("A", d, a, count);
        MyThreadPrinter pb = new MyThreadPrinter("B", a, b, count);
        MyThreadPrinter pc = new MyThreadPrinter("C", b, c, count);
        MyThreadPrinter pd = new MyThreadPrinter("D", c, d, count);
        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
        new Thread(pd).start();
        Thread.sleep(100);
    }
    public static class MyThreadPrinter implements Runnable{
        private String name;
        private Object prev;
        private Object self;
        private int count;

        public MyThreadPrinter(String name, Object prev, Object self, int count) {
            this.name = name;
            this.prev = prev;
            this.self = self;
            this.count = count;
        }

        @Override
        public void run() {
            while (count>0){
                synchronized (prev){
                    synchronized (self){
                        System.out.print(name);
                        count--;
                        self.notify();
                        //唤醒self
                    }
                    if (count==0){
                        break;
                    }
                    try {
                        prev.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
