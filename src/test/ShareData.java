package test;

public class ShareData {
    /*
    关于并发多线程共享性，互斥性，原子性
     */
    public  static int count = 0;
    public synchronized void addCount(){
        count++;
    }
    public static void main(String[] args) {
        final ShareData shareData = new ShareData();
        for (int i =0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    for (int i=0;i<100;i++){
                        shareData.addCount();
                    }
                    System.out.print(count+" ");
                }
            }).start();
        }
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("count = "+count);
    }
}
