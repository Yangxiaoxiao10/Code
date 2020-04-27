package ThreadTest;

/**
 * @Author 杨晓晓
 * @Date 2020/3/29 19:44
 * @Version 1.0
 */
public class Test_join {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2("子线程");
        myThread2.start();
        try {
            myThread2.join();
            //这里的join挂起的是main线程，因为是在main中调用了mt.join
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("I am main Thread");
        }
    }

    public static  class MyThread2 extends Thread{
        public MyThread2(String name){
            super(name);
        }
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am " + getName());
            }
            try {
                //子线程sleep10000millis后，执行main线程
                sleep(10000);
            } catch (InterruptedException e) {
                return;
            }

        }
    }
}
