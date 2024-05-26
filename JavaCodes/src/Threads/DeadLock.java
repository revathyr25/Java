package Threads;

public class DeadLock {
    public static void main(String[] args) {
        String lock1="lock1";
        String lock2="lock2";

        Thread thread1=new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("thread one");
                }
            }
        });
        Thread thread2=new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("thread two");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
