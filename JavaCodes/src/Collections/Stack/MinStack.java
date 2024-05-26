package Collections.Stack;

import java.util.ArrayList;

public class MinStack {

    ArrayList<Integer> arr;
    ArrayList<Integer> brr;
    int top;
    int min;
    public MinStack() {
        arr=new ArrayList();
        brr=new ArrayList();
        top=-1;
        min=0;
    }

    public void push(int val) {
        arr.add(val);
        top++;
        if(top==0){
            min=val;
            brr.add(val);
        }else if(min>val){
            min=top();
        }
    }

    public void pop() {
        arr.set(top,null);
        top--;
    }

    public int top() {
        return arr.get(top);

    }

    public int getMin() {
        return 0;
    }
}
