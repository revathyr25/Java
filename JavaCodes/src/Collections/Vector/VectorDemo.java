package Collections.Vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public void addVector() {
        Vector<Integer> vector=new Vector<>();
        vector.add(1);
        vector.add(6);
        vector.add(3);
        System.out.println("added");
        System.out.println("capacity "+vector.capacity());
        vector.remove(1);
        for(int i:vector){
            System.out.println(i);

        }
    }

    public void addArrayList() {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(3);
        System.out.println("added");
        System.out.println("capacity "+arrayList.size());
        for(int i:arrayList){
            System.out.println(i);

        }
    }

    public void ArrayVector() throws InterruptedException {
        int size=1000000;
        //arraylist for 1 million addition
        ArrayList<Integer> arrayList=new ArrayList<>();
        long start=System.currentTimeMillis();
        for(int i=0;i<size;i++){
            arrayList.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("time arraylist "+(end-start)+"ms");

        //vector for 1 million addition
        Vector<Integer> vector=new Vector<>();
        start=System.currentTimeMillis();
        for(int i=0;i<size;i++){
            vector.add(i);
        }
        end=System.currentTimeMillis();
        System.out.println("time vector "+(end-start)+"ms");

        //arraylist addition using multithread
        List<Object> multiThreadList= Collections.synchronizedList(new ArrayList<>());
        start=System.currentTimeMillis();
        Thread t1=new Thread(()->{
            for(int i=0;i<size;i++){
                multiThreadList.add(i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<size;i++){
                multiThreadList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end=System.currentTimeMillis();
        System.out.println("time multiThreadList "+(end-start)+"ms");
        System.out.println("size multiThreadList "+multiThreadList.size());

        //vector addition using multithread
        Vector<Integer> multiThreadVector=new Vector<>();
        start=System.currentTimeMillis();
         t1=new Thread(()->{
            for(int i=0;i<size;i++){
                multiThreadVector.add(i);
            }
        });
         t2=new Thread(()->{
            for(int i=0;i<size;i++){
                multiThreadVector.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end=System.currentTimeMillis();
        System.out.println("time multiThreadVector "+(end-start)+"ms");
        System.out.println("size multiThreadVector "+multiThreadVector.size());
    }
}
