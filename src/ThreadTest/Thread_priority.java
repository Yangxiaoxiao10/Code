package ThreadTest;

/**
 * @Author 杨晓晓
 * @Date 2020/3/29 23:26
 * @Version 1.0
 */
public class Thread_priority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.setPriority(Thread.NORM_PRIORITY + 3);
        //优先执行 优先级高的
        t1.start();
        t2.start();
    }
    public static class Thread1 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 40; i++) {
                System.out.println("T1: " + i);
            }
        }
    }
    public static class Thread2 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 40; i++) {
                System.out.println("T2: " + i);
            }
        }
    }
}
