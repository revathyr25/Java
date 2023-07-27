package Threads;

public class Sample extends Thread{

    private int threadNum;
    public Sample(int threadNum){
        this.threadNum=threadNum;
    }
    @Override
    public void run(){
        for (int i=0;i<5;i++)
            System.out.println(i+" of thread "+threadNum);
    }
}
