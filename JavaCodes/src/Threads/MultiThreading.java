package Threads;

public class MultiThreading {
    public static void main(String[] args)  {

        for (int i=0;i<5;i++){
            Sample sample=new Sample(i);
            sample.start();
            try {
                sample.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        //using implementing runnable interface
        System.out.println("using implementing runnable interface");
        for (int i=0;i<5;i++){
            Sample2 sample2=new Sample2(i);
            Thread thread=new Thread(sample2);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}