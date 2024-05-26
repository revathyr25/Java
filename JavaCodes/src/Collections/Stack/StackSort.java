package Collections.Stack;

import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(34);
        s.add(3);
        s.add(31);
        s.add(98);
        s.add(92);
        s.add(23);
        System.out.println("Top of the stack is "+s.peek());
        Stack<Integer> tmpStack=Sort(s);
        System.out.println("Top of the stack is "+tmpStack.peek());
        for (Integer i:tmpStack){
            System.out.println(i);
        }

        System.out.println("removing certain element from stack");
        Stack<Integer> sc=new Stack<>();
        sc.add(5);
        sc.add(4);
        sc.add(6);
        sc.remove(sc.indexOf(6));
        System.out.println(sc);
    }

    public static Stack<Integer> Sort(Stack<Integer> s){
        Stack<Integer> tmpStack=new Stack<>();
        while (!s.isEmpty()){
            int tmp= s.pop();
            while (!tmpStack.isEmpty()&&tmpStack.peek()<tmp){
            s.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}
