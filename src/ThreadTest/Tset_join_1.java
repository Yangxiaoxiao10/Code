package ThreadTest;

import sun.security.krb5.internal.TGSRep;

/**
 * @Author 杨晓晓
 * @Date 2020/3/29 22:26
 * @Version 1.0
 */
//join():让当前线程执行完，主线程挂起，其他线程正常执行
public class Tset_join_1 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" start");
        MyThread mt1 = new MyThread("A");
        MyThread mt2 = new MyThread("B");
        MyThread mt3 = new MyThread("C");
        System.out.println("mt1 start");
        mt1.start();
        System.out.println("mt1 end");
//        mt1.join();
        //join(),让m1先执行完，B线程需要等A线程执行完毕之后才能执行
        System.out.println("mt2 start");
        mt2.start();
        System.out.println("mt2 end");
        mt2.join();
        //m1.join()方法只会使主线程进入等待池并等待t线程执行完毕后才会被唤醒。
        // 并不影响同一时刻处在运行状态的其他线程。
        //C是在main线程结束后，才运行
        /*-------------------*/
        //通用专业解释：这里只要记住，哪个线程挂起【不仅是上面说的main】，取决于在哪个线程上调用x.join方法，
        // 而不是影响到所有的线程
        System.out.println("mt3 start");
        mt3.start();
        System.out.println("mt3 end");
        System.out.println(Thread.currentThread().getName()+" end");
    }
    public static class MyThread extends Thread{
        private String name;
        public  MyThread(String name){
            this.name = name;
        }
        @Override
        public void run() {
            for (int i = 0; i <5; i++) {
                System.out.println(name+"-"+i);
            }
        }
    }
}
