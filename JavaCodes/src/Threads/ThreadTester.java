package Threads;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("inside main");
        Thread thread1=new Thread1("ThreadOne");
//        thread1.setDaemon(true);
//        System.out.println("is thread1 daemon "+thread1.isDaemon());
        thread1.start();

        Thread thread2=new Thread(new Thread2());
        thread2.start();
        System.out.println("main ended");

        Thread1 thread11=new Thread1("Thread11");
        thread11.start();
    }
}
