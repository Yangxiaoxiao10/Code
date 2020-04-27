package ThreadTest;

/**
 * @Author 杨晓晓
 * @Date 2020/3/29 23:04
 * @Version 1.0
 */
public class Tset_yield {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("t1");
        MyThread3 t2 = new MyThread3("t2");
        t1.start();
        t2.start();
    }
    public static class MyThread3 extends Thread {

        public MyThread3(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i <= 50; i++) {
                System.out.println(getName() + ": " + i);
                if (i % 10 == 0) {
                    yield();
                    //两个线程交替执行，但是在整10时候，某一线程必定挂起，换另一线程执行
                }
            }
        }
    }
}
