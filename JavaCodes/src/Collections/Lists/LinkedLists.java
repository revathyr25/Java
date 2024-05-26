package Collections.Lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<String> fruits=new LinkedList<>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("orange");
        fruits.add("plum");
        for (String i:fruits)
            System.out.println(i);
    }

    //uses doubly linked list internally to store elements
    //maintain insertion order
    //can have duplicates
    //not synchronized so not threadsafe
    //better for manipulating data
    //manipulation is fast since no bit shifting is required
    //memory location is not contiguous
}
